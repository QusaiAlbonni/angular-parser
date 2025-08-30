package org.generator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.classes.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AngularGenerator2 {
    private ArrayList<HashMap<String, String>> components;
    private HashMap<String, String> currentComponent;
    private ArrayList<String> services;
    private String routes;
    private ArrayList<String> extraClasses;
    private boolean activeService;

    public AngularGenerator2 (){
        this.components = new ArrayList<>();
        this.services = new ArrayList<>();
        this.extraClasses = new ArrayList<>();
        this.activeService = false;
    }

    public void addNewComponent(DecoratorApplication componentDeclaration) {
        ParameterList parameterList =  componentDeclaration.getParameterList();
        List<Parameter> parameters = parameterList.getParameters();
        System.out.println("HELLO3");
        for (Parameter property : parameters){
            System.out.println("HELLO2");
            ExpressionStatement expressionStatement = property.getExpressionStatement();
            ObjectDeclaration expr = ((ObjectDeclaration)((BinaryExpression)(((LogicalExpression)((ConditionalExpression) expressionStatement.getExpression()).getCondition()).getLeft())).getLeft());
            if (expr instanceof ObjectDeclaration){
                System.out.println("HELLO");
                ObjectBody ob = ((ObjectDeclaration) expr).getObjectBody();
                List<ObjectMember> list = ob.getObjectMemberList();
                boolean foundSelector = false;
                Template ftemplate = null;
                for (ObjectMember om : list){
                    String propertyId = om.getID();
                    if (propertyId != null && propertyId.equals("selector")){
                        ConditionalExpression expr2 = (ConditionalExpression) om.getExpression();
                        LogicalExpression cond = (LogicalExpression) expr2.getCondition();
                        BinaryExpression left = (BinaryExpression) cond.getLeft();
                        PrimaryExpression left2 = (PrimaryExpression) left.getLeft();
                        String selector = left2.getStringValue();
                        this.initComponent(selector);

                    }
                    Template template = om.getTemplate();
                    if (template != null){
                        ftemplate = template;
                    }
                }
                if (ftemplate == null) {
                    System.out.println("Template not found.");
                    return;
                };
                System.out.println("TEMPLATE");
                System.out.println(ftemplate.toCode());
                this.addComponentTemplate(ftemplate.toCode());
            }
        }
    }

    public void initNewService(){
        this.activeService = true;
    }

    public void initComponent(String selector){
        HashMap<String, String> component = new HashMap<>();
        component.put("selector", selector);
        this.components.add(component);
        this.currentComponent = component;
    }

    public void addComponentTemplate(String template){
        if (this.currentComponent == null) return;
        this.currentComponent.put("template", template);
    }

    public void addComponentClass(String C){
        if (this.currentComponent == null) return;
        this.currentComponent.put("class", C);
        this.currentComponent = null;
    }

    public void addServiceClass(String klass){
        if(!this.activeService) return;
        this.services.add(klass);
        this.activeService = false;
    }

    public void addRoutes(String routes){
        this.routes = routes;
    }

    public void addExtraClass(String klass){
        this.extraClasses.add(klass);
    }

    public void print() throws JsonProcessingException {
        System.out.println("Classes: ");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String prettyJson = mapper.writeValueAsString(this.components);
        System.out.println(prettyJson);

        System.out.println("Services: ");
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        prettyJson = mapper.writeValueAsString(this.services);
        System.out.println(prettyJson);
    }

    public String generate(){
        StringBuilder sb = new StringBuilder();

        for (String klass : extraClasses){
            sb.append(klass).append("\n");
        }

        for (HashMap<String, String > map : this.components){
            sb.append("Mini.defineComponent( ").append(map.get("selector")).append(", ").append(map.get("class")).append(", ").append("`").append(map.get("template")).append("`").append(");\n");
        }
        for (String svc: this.services){
            sb.append("Mini.defineService( ").append("'" + svc + "'").append(", ").append("() => new ").append(svc).append("()").append(");\n");
        }

        sb.append(this.routes).append(";\n");
        sb.append("Mini.addRoutes(routes);\n");

        return sb.toString();
    }
}

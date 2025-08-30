package org.classes;

public class AngularAttribute {
    BindingAttribute bindingAttribute;
    EventBindingAttribute eventBindingAttribute;
    public TwoWayBinding twoWayBinding;
    ForAttribute forAttribute;
    IfAttribute ifAttribute;
    public  AngularAttribute(){

    }

    public BindingAttribute getBindingAttribute() {
        return bindingAttribute;
    }

    public void setBindingAttribute(BindingAttribute bindingAttribute) {
        this.bindingAttribute = bindingAttribute;
    }

    public EventBindingAttribute getEventBindingAttribute() {
        return eventBindingAttribute;
    }

    public void setEventBindingAttribute(EventBindingAttribute eventBindingAttribute) {
        this.eventBindingAttribute = eventBindingAttribute;
    }

    public ForAttribute getForAttribute() {
        return forAttribute;
    }

    public void setForAttribute(ForAttribute forAttribute) {
        this.forAttribute = forAttribute;
    }

    public IfAttribute getIfAttribute() {
        return ifAttribute;
    }

    public void setIfAttribute(IfAttribute ifAttribute) {
        this.ifAttribute = ifAttribute;
    }

    @Override
    public String toString() {
        if(bindingAttribute!=null){
            return "\nAngularAttribute{" +
                    "\nbindingAttribute=" + bindingAttribute+"\n" ;
        }
        if(eventBindingAttribute!=null){
            return "AngularAttribute{" +
                    "\neventBindingAttribute=" + eventBindingAttribute +"\n";
        }
        if(forAttribute!=null){
            return "AngularAttribute{" +
                    "\nforAttribute=" + forAttribute +"\n";
        }
        if(ifAttribute!=null){
            return "AngularAttribute{" +
                    "\nifAttribute=" + ifAttribute+"\n" ;
        }
        return "AngularAttribute{" +
                "\nbindingAttribute=" + bindingAttribute +
                "\neventBindingAttribute=" + eventBindingAttribute +
                "\nforAttribute=" + forAttribute +
                "\nifAttribute=" + ifAttribute +
                '}'+"\n";
    }

    public String toCode() {
        if (bindingAttribute != null) {
            return bindingAttribute.toCode();
        }
        if (eventBindingAttribute != null) {
            return eventBindingAttribute.toCode();
        }
        if (forAttribute != null) {
            return forAttribute.toCode();
        }
        if (ifAttribute != null) {
            return ifAttribute.toCode();
        }
        if (twoWayBinding != null){
            System.out.println("TWO WAY");
            return twoWayBinding.toCode();
        }
        return "";
    }
}

package org.classes;

public class AngularAttribute {
    BindingAttribute bindingAttribute;
    EventBindingAttribute eventBindingAttribute;
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
        return "AngularAttribute{" +
                "\nbindingAttribute=" + bindingAttribute +
                "\neventBindingAttribute=" + eventBindingAttribute +
                "\nforAttribute=" + forAttribute +
                "\nifAttribute=" + ifAttribute +
                '}';
    }
}

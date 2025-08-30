package org.classes;

public class TwoWayBinding {
    private String variableName;
    private String value; // ممكن تغير النوع حسب الحاجة، String مؤقت

    public TwoWayBinding(String variableName) {
        this.variableName = variableName;
        this.value = ""; // قيمة افتراضية فارغة
    }

    public TwoWayBinding(String variableName, String value) {
        this.variableName = variableName;
        this.value = value;
    }

    // getters و setters
    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TwoWayBinding{" +
                "variableName='" + variableName + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String toCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("[(ngModel)]=");
        if (value != null) {
            sb.append(value);
        }
        return sb.toString();
    }
}

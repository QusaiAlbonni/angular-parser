package org.classes;

public class IncreamentExpression extends Expression{
String id;boolean isIncreament;

    public IncreamentExpression() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIncreament() {
        return isIncreament;
    }

    public void setIncreament(boolean increament) {
        isIncreament = increament;
    }

    @Override
    public String toString() {
        if (isIncreament)
        return "IncreamentExpression{" +
                "id='" + id + '\'' +
                ", isIncreament=" + isIncreament +
                '}';
        else
        return "IncreamentExpression{" +
                "id='" + id + '\'' +
                ", isDecreament=" + isIncreament +
                '}';

    }

    @Override
    public String toCode() {
        StringBuilder sb = new StringBuilder();
        if (id != null) {
            sb.append(id);
        }
        if (isIncreament) {
            sb.append("++");
        } else {
            sb.append("--");
        }
        sb.append("\n");
        return sb.toString();
    }
}

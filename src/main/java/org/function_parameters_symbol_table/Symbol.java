package org.function_parameters_symbol_table;

public class Symbol {
    String name;
    String type;
    int parameterCount; // 👈 جديد



    public Symbol(String name, String type, int parameterCount) {
        this.name = name;
        this.type = type;
        this.parameterCount = parameterCount;
    }

    public int getParameterCount() {
        return parameterCount;
    }
}

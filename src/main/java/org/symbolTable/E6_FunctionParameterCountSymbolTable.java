package org.symbolTable;

import java.util.HashMap;
import java.util.Map;

public class E6_FunctionParameterCountSymbolTable {
    private final Map<String, Integer> functionParamCountMap = new HashMap<>();

    public void define(String functionName, int paramCount) {
        functionParamCountMap.put(functionName, paramCount);
    }

    public Integer getParameterCount(String functionName) {
        return functionParamCountMap.get(functionName);
    }

    public boolean contains(String functionName) {
        return functionParamCountMap.containsKey(functionName);
    }
}

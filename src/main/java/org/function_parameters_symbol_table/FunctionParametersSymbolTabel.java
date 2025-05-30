package org.function_parameters_symbol_table;

import java.util.HashMap;
import java.util.Map;

public class FunctionParametersSymbolTabel {
    Map<String, Symbol> symbols = new HashMap<>();

    public boolean define(Symbol symbol) {
        if (symbols.containsKey(symbol.name)) {
            return false; // ⚠️ موجود مسبقاً
        }
        symbols.put(symbol.name, symbol);
        return true;
    }

    public Symbol resolve(String name) {
        return symbols.get(name); // null إذا غير معرف
    }

    public void clearParameters() {
        // مسح بارامترات الدالة السابقة بعد الانتهاء منها
        symbols.entrySet().removeIf(entry -> !"function".equals(entry.getValue().type));
    }
}

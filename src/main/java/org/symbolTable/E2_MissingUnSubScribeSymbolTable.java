package org.symbolTable;

import org.main.Main;


import java.util.*;

public class E2_MissingUnSubScribeSymbolTable {
    private final Set<String> subscriptions=new HashSet<>();
    private final Set<String> unsubscribed=new HashSet<>();

    public void addSubscription(String varName) {
        subscriptions.add(varName);
    }
    public void addUnsubscribed(String varName) {
        unsubscribed.add(varName);
    }

    public Set<String> getSubscriptions() {
        return subscriptions;
    }

    public Set<String> getUnsubscribed() {
        return unsubscribed;
    }
}

package com.prabhakar;

public abstract class Sweet {
    protected String name;
    protected Integer weight;
    protected Integer cost;
    Sweet(String sweetName, Integer weightOfSweet, Integer cost) {
        this.name = sweetName;
        this.weight = weightOfSweet;
        this.cost = cost;
    }
    String getName() {
        return name;
    }
    Integer getWeight() {
        return weight;
    }
    Integer getCost() {
        return cost;
    }

    abstract String getSweetClass();
}

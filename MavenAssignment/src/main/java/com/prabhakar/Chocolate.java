package com.prabhakar;

public class Chocolate extends Sweet {
    Chocolate(String name, Integer weight, Integer cost){
        super(name,weight,cost);
    }

    @Override
    String getSweetClass() {
        return "Chocolate";
    }

}

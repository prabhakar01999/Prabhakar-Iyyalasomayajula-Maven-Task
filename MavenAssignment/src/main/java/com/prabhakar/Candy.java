package com.prabhakar;

public class Candy extends Sweet {
    Candy(String name, Integer weight, Integer cost){
        super(name, weight, cost);
    }

    @Override
    String getSweetClass() {
        return "Candy";
    }
}

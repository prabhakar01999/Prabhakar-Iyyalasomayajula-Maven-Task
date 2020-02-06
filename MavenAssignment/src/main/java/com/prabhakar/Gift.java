package com.prabhakar;

import java.util.ArrayList;
import java.util.Collections;

public class Gift implements GiftOperations{
    private ArrayList<Sweet> sweets;
    Gift(){
        sweets = new ArrayList<>();
    }
    Gift(ArrayList<Sweet> sweets){
        this.sweets = sweets;
    }

    void addSweet(Sweet sweet){
        this.sweets.add(sweet);
    }

    Integer noOfSweets(){
        return sweets.size();
    }

    Integer noOfCandies(){
        int countCandies = 0;
        for(Sweet sweet: sweets){
            if(sweet.getSweetClass().compareTo("Candy") == 0) {
                countCandies++;
            }
        }
        return countCandies;
    }

    Integer noOfChocolates(){
        int countChocolates = 0;
        for(Sweet sweet : sweets){
            if(sweet.getSweetClass().compareTo("Chocolate") == 0) {
                countChocolates++;
            }
        }
        return countChocolates;
    }

    ArrayList<Candy> getCandiesByWeight(Integer lowerBound, Integer upperBound){
        ArrayList<Candy> candies = new ArrayList<>();
        Integer weight;
        for(Sweet sweet : sweets){
            if(sweet.getSweetClass().compareTo("Candy") == 0){
                weight = sweet.getWeight();
                if(weight >= lowerBound && weight <= upperBound){
                    candies.add((Candy) sweet);
                }
            }
        }
        return candies;
    }

    ArrayList<Candy> getCandiesByCost(Integer lowerBound, Integer upperBound){
        ArrayList<Candy> candies = new ArrayList<>();
        Integer cost;
        for(Sweet sweet : sweets){
            if(sweet.getSweetClass().compareTo("Candy") == 0){
                cost = sweet.getWeight();
                if(cost >= lowerBound && cost <= upperBound){
                    candies.add((Candy) sweet);
                }
            }
        }
        return candies;
    }

    ArrayList<Chocolate> getChocolatesByWeight(Integer lowerBound, Integer upperBound){
        ArrayList<Chocolate> chocolates = new ArrayList<>();
        Integer weight;
        for(Sweet sweet : sweets){
            if(sweet.getSweetClass().compareTo("Chocolate") == 0){
                weight = sweet.getWeight();
                if(weight >= lowerBound && weight <= upperBound){
                    chocolates.add((Chocolate) sweet);
                }
            }
        }
        return chocolates;
    }

    ArrayList<Chocolate> getChocolatesByCost(Integer lowerBound, Integer upperBound){
        ArrayList<Chocolate> chocolates = new ArrayList<>();
        Integer cost;
        for(Sweet sweet : sweets){
            if(sweet.getSweetClass().compareTo("Chocolate") == 0){
                cost = sweet.getWeight();
                if(cost >= lowerBound && cost <= upperBound){
                    chocolates.add((Chocolate) sweet);
                }
            }
        }
        return chocolates;
    }

    ArrayList<Sweet> getSweets(){
        return sweets;
    }

    @Override
    public Integer sumOfWeights() {
        Integer sum = 0;
        for(Sweet sweet: sweets){
            sum+= sweet.weight;
        }
        return sum;
    }

    @Override
    public ArrayList<Sweet> sortChocolates(String sortingKey) {
        if (sortingKey.compareTo("name") == 0) {
            Collections.sort(sweets, new SortByName());
        }

        else if (sortingKey.compareTo("cost") == 0){
            Collections.sort(sweets, new SortByCost());
        }

        else {
            Collections.sort(sweets, new SortByWeight());
        }
        return sweets;
    }

}

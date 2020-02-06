package com.prabhakar;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        //1. Creating multiple objects of sweets
        //Runtime Polymorphism
        Sweet sweet1 = new Candy("Mango Bite", 10, 2);
        Sweet sweet2 = new Candy("Pulse", 15, 1);
        Sweet sweet3 = new Chocolate("Cadbury", 50, 30);
        Sweet sweet4 = new Chocolate("Bournville", 50, 50);

        //2. Collect children's gift to define total weight
        Gift gift = new Gift();
        gift.addSweet(sweet1);
        gift.addSweet(sweet2);
        gift.addSweet(sweet3);
        gift.addSweet(sweet4);

        Integer weightsOfSweets = gift.sumOfWeights();
        System.out.println(weightsOfSweets);

        //3. Sort the chocolates in the gift by one of the options;
        System.out.println("Select one of the options below for sorting:");
        System.out.println("1. Sort by name");
        System.out.println("2. Sort by weight");
        System.out.println("3. Sort by cost");

        Integer choice = in.nextInt();

        sortChocolates(gift, choice);

        //3. Find the candies in the gift corresponding to a predetermined range of options
        System.out.println("Select one of the options below:");
        System.out.println("1. Find candies based on weight");
        System.out.println("2. Find candies based on cost");

        choice = in.nextInt();
        Integer lowerBound;
        Integer upperBound;
        System.out.println("Enter lower bound: ");
        lowerBound =  in.nextInt();
        System.out.println("Enter upper bound: ");
        upperBound = in.nextInt();
        findCandies(gift, choice, lowerBound, upperBound);

    }

    public static void sortChocolates(Gift gift, Integer choice){
        ArrayList<Sweet>sortedSweets;
        switch (choice){
            case 1:
                sortedSweets = gift.sortChocolates("name");
                break;
            case 2:
                sortedSweets = gift.sortChocolates("weight");
                break;
            default:
                sortedSweets = gift.sortChocolates("cost");
        }

        System.out.println("The sorted order of Chocolates is: ");
        for(Sweet sweet : sortedSweets){
            if(sweet.getSweetClass().compareTo("Chocolate") == 0){
                System.out.println("Name: "+sweet.getName()+" Weight: "+sweet.getWeight()+ " Cost: "+sweet.getCost());
            }
        }
    }
    public static void findCandies(Gift gift, Integer choice, Integer lowerBound, Integer upperBound){
        ArrayList<Candy> candies;
        switch (choice){
            case 1:
                candies = gift.getCandiesByWeight(lowerBound, upperBound);
                break;
            default:
                candies = gift.getCandiesByCost(lowerBound, upperBound);
        }
        System.out.println("The Candies in the specified range are: ");
        for(Candy candy : candies){
            if(candy.getSweetClass().compareTo("Chocolate") == 0){
                System.out.println("Name: "+candy.getName()+" Weight: "+candy.getWeight()+ " Cost: "+candy.getCost());
            }
        }
    }
}

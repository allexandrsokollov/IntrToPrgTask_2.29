package com.company;

import java.util.Scanner;

public class Customer {

    private double amountOfMoney;
    private int maxAmountOfCakesAbleToBuy;
    private Scanner in = new Scanner(System.in);

    public Customer() {
        System.out.print("\nEnter amount of money: ");
        this.amountOfMoney = in.nextDouble();
        this.maxAmountOfCakesAbleToBuy = 0;
    }

    public int countMaxAmountOfCakes(Cake first, Cake second){

        if(first.getAmount() == 0 || second.getAmount() == 0)
            return maxAmountOfCakesAbleToBuy;
        else {
            for (int i = 1; i <= first.getAmount(); i++) {
                for (int j = 1; j <= second.getAmount(); j++) {

                    double costOfPurchase = i * first.getCost() + j * second.getCost();
                    int amountOfCakesAtTheMoment = i + j;

                    if (costOfPurchase <= amountOfMoney && amountOfCakesAtTheMoment > maxAmountOfCakesAbleToBuy) {
                        maxAmountOfCakesAbleToBuy = amountOfCakesAtTheMoment;
                    }
                }
            }

            return maxAmountOfCakesAbleToBuy;
        }
    }

    public int getMaxAmountOfCakesAbleToBuy() {
        return maxAmountOfCakesAbleToBuy;
    }
}

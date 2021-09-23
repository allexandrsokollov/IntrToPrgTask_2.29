package com.company;

import java.util.Scanner;

public class Customer {

    private double amountOfMoney;
    private int maxAmountOfCakesAbleToBuy = 0;
    private Scanner in = new Scanner(System.in);

    public void countMaxAmountOfCakes(Cake first, Cake second){
        if (amountOfMoney < (first.getCakePrice() + second.getCakePrice()) ||
                first.getAmountOfThisCake() == 0 || second.getAmountOfThisCake() == 0) {
            return;
        }

        if (first.getCakePrice() < second.getCakePrice()) {
            Cake tmp = first;
            first = second;
            second = tmp;
        }

        buyCake(first, 1);
        buyCakeWhileAble(second);
        if (amountOfMoney >= first.getCakePrice()) {
            buyCakeWhileAble(first);
        }
    }

    private void buyCakeWhileAble(Cake cake) {

    double amountOfCakesAbleToBuy = amountOfMoney / cake.getCakePrice();
    buyCake(cake, (int)amountOfCakesAbleToBuy);

    }

    private void buyCake(Cake cake, int amount) {
        maxAmountOfCakesAbleToBuy += amount;
        cake.decrementAmountOfCake(amount);
        amountOfMoney -= cake.getCakePrice() * amount;
    }


    public int getMaxAmountOfCakesAbleToBuy() {
        return maxAmountOfCakesAbleToBuy;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}

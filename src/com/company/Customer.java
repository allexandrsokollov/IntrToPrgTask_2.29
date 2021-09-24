package com.company;

import java.util.Scanner;

public class Customer {

    private int amountOfMoney;
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

    int ableToBuy = Math.floorDiv(amountOfMoney, cake.getCakePrice() );
    if(ableToBuy >= cake.getAmountOfThisCake()) {
        ableToBuy = cake.getAmountOfThisCake();
    }
    buyCake(cake, ableToBuy);

    }

    private void buyCake(Cake cake, int amount) {
        maxAmountOfCakesAbleToBuy += amount;
        cake.decrementAmountOfCake(amount);
        amountOfMoney -= (cake.getCakePrice() * amount);
    }


    public int getMaxAmountOfCakesAbleToBuy() {
        return maxAmountOfCakesAbleToBuy;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}

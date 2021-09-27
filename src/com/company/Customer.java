package com.company;

public class Customer {

    private int amountOfMoney;
    private int maxAmountOfCakesAbleToBuy = 0;

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

        buyCake(first);
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

    private void buyCake(Cake cake) {
        maxAmountOfCakesAbleToBuy++;
        cake.decrementAmountOfCake(1);
        amountOfMoney -= cake.getCakePrice();
    }


    public int getMaxAmountOfCakesAbleToBuy() {
        return maxAmountOfCakesAbleToBuy;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}

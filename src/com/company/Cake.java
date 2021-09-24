package com.company;

public class Cake {
    private int cakePrice;
    private int amountOfThisCake;
    private static int amountOfCakes;
    private int numberOfThisCake;

    public Cake() {
        amountOfCakes++;
        numberOfThisCake = amountOfCakes;
    }

    public int getCakePrice() {
        return cakePrice;
    }

    public void setCakePrice(int cakePrice) {
        this.cakePrice = cakePrice;
    }

    public int getAmountOfThisCake() {
        return amountOfThisCake;
    }

    public void setAmountOfThisCake(int amountOfThisCake) {
        this.amountOfThisCake = amountOfThisCake;
    }

    public int getNumberOfThisCake() {
        return numberOfThisCake;
    }

    public void decrementAmountOfCake(int amount) {
        amountOfThisCake -= amount;
    }
}

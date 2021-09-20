package com.company;

import java.util.Scanner;

public class Cake {
    private static int cakeNumber = 0;
    private double cost;
    private int amount;
    private Scanner in = new Scanner(System.in);

    public Cake() {
        this.cakeNumber++;

        System.out.print("\nEnter price of cake number " + cakeNumber + ": ");
        this.cost = in.nextDouble();

        System.out.print("Enter amount of cake number " + cakeNumber + ": ");
        this.amount = in.nextInt();
    }

    public double getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }
}

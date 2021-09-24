package com.company;

import java.util.Scanner;

public class GetDataForClasses {
    private static Scanner in = new Scanner(System.in);

    public static void getCakeData(Cake cake) {
        System.out.print("\nEnter price of cake number " + cake.getNumberOfThisCake() + ": ");
        cake.setCakePrice(in.nextInt());

        System.out.print("\nEnter amount of cakes number " + cake.getNumberOfThisCake() + ": ");
        cake.setAmountOfThisCake(in.nextInt());
    }

    public static void getCustomerData(Customer customer) {
        System.out.print("\nEnter amount of money: ");
        customer.setAmountOfMoney(in.nextInt());
    }
}

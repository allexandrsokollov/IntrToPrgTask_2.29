package com.company;
/*
В магазине продаются торты 2-х видов. Цена первого торта Р1, в наличии N1 торта такого вида. Цена второго торта Р2,
в наличии №2 торта такого вида.
Какое максимальное кол-во тортов можно купить в данном магазине располагая суммой в М денег.

29. Задача соответствует предыдущей, однако есть дополнительное условие.
Обязательно необходимо купить разные торты (т.е. хотя бы один торт каждого вида).
Если такое невозможно, торты вообще не покупать.
*/


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Locale.setDefault(Locale.ROOT);

	Scanner in = new Scanner(System.in);

        System.out.print("Enter amount of money: ");
        double amountOfMoney = in.nextDouble();

        System.out.print("\nEnter first type cake price: ");
        double firstTypeCakePrice = in.nextDouble();
        System.out.print("\nEnter amount of first type cake: ");
        int amountOfFirstTypeCake = in.nextInt();

        System.out.print("\nEnter second type cake price: ");
        double secondTypeCakePrice = in.nextDouble();
        System.out.print("\nEnter amount of second type cake: ");
        int amountOfSecondTypeCake = in.nextInt();


        int maxAmountOfCakes = 0;

        for(int i = 1; i <= amountOfFirstTypeCake; i++) {
            for(int j = 1; j <= amountOfSecondTypeCake; j++) {
                double costOfPurchase = i * amountOfFirstTypeCake + j * amountOfSecondTypeCake;
                int amountOfCakesAtTheMoment = i + j;
                if(costOfPurchase <= amountOfMoney && amountOfCakesAtTheMoment > maxAmountOfCakes) {
                    maxAmountOfCakes = amountOfCakesAtTheMoment;
                }
            }
        }

        System.out.printf("\n\nmaximum amount of cakes we can buy is: %d" , maxAmountOfCakes);


    }
}

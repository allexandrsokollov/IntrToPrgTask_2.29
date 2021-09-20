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

public class Main {

    public static void main(String[] args) {
	Locale.setDefault(Locale.ROOT);

	Customer customer = new Customer();
	Cake firstCake = new Cake();
	Cake secondCake = new Cake();

	customer.countMaxAmountOfCakes(firstCake, secondCake);

	System.out.printf("\n\nmaximum amount of cakes we can buy is: %d", customer.getMaxAmountOfCakesAbleToBuy());



    }
}

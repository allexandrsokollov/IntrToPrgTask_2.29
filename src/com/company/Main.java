package com.company;

import java.util.Locale;
/*
В магазине продаются торты 2-х видов. Цена первого торта Р1, в наличии N1 торта такого вида. Цена второго торта Р2,
в наличии №2 торта такого вида.
Какое максимальное кол-во тортов можно купить в данном магазине располагая суммой в М денег.

29. Задача соответствует предыдущей, однако есть дополнительное условие.
Обязательно необходимо купить разные торты (т.е. хотя бы один торт каждого вида).
Если такое невозможно, торты вообще не покупать.
*/
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.getDefault());

        Customer customer = new Customer();
        GetDataForClasses.getCustomerData(customer);

        Cake first = new Cake();
        Cake second = new Cake();
        GetDataForClasses.getCakeData(first);
        GetDataForClasses.getCakeData(second);

        customer.countMaxAmountOfCakes(first, second);

        System.out.println("\n\n" + customer.getMaxAmountOfCakesAbleToBuy());

    }
}

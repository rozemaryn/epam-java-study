package com.kostyanetskaya.epamjavastudy.lesson3.tasks;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder

        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        int slices = input.nextInt();

        int pizzas = 1;

        while ((pizzas*slices)%people !=0) {
            pizzas++;
        }
        System.out.println(pizzas);

    }
}

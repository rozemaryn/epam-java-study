package com.kostyanetskaya.epamjavastudy.lesson3.tasks;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        /*
        Дано следующее условие: компания друзей посещает ресторан.
        Они решили разделить счет поровну и добавить 10 процентов от общей суммы счета в качестве чаевых.
        Далее друзья равными частями покрывают общую сумму платежа.

        Перейдите в класс GoDutch и напишите программу, которая считывает общую сумму счета
        и количество друзей, а затем выводит размер части оплаты.

        Условия:
        1) Программа должна читать данные из System.in
        2) Общая сумма счета не может быть отрицательной. Если введенное значение отрицательное,
        программа останавливается и печатает: Bill total amount cannot be negative
        3) Количество друзей не может быть отрицательным или нулевым. Если такое происходит,
        то программа останавливается и выводит: Number of friends cannot be negative or zero
        4) Общая сумма счета, количество друзей и часть к оплате являются целыми числами.
         */

        Scanner sc = new Scanner(System.in);
        int totalBill = sc.nextInt();
        int numberOfFriends = sc.nextInt();
        int splitBill;

        if (totalBill < 0) {
            System.out.println("Bill total amount cannot be negative");
        }
        else if(numberOfFriends <=0) {
            System.out.println("Number of friends cannot be negative or zero");
        }
        else {
            splitBill = (int) Math.ceil((double) totalBill / numberOfFriends + (totalBill / numberOfFriends / 100 * 10));
            System.out.println(splitBill);
        }
    }
}

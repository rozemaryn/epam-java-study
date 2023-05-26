package com.kostyanetskaya.epamjavastudy.lesson3.tasks;

import java.util.Scanner;

public class FindMaxInSeq {
    /*
    Напишите программу, которая считывает последовательность целочисленных значений
    из стандартного вывода и находит максимальное из них.
    Вы должны считывать значения последовательности, пока следующее не станет 0.
    Нулевое значение означает конец входной последовательности и не является ее элементом.
    Последовательность гарантированно содержит хотя бы одно значение.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner inputScanner = new Scanner(input);

        int max = inputScanner.nextInt();

        int value;
        while ((value = inputScanner.nextInt()) != 0) {
            if (max < value) {
                max = value;
            }
        }
        scanner.close();
        inputScanner.close();

        System.out.println(max);
    }
}

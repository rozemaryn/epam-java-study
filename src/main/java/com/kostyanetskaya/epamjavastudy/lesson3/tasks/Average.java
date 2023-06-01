package com.kostyanetskaya.epamjavastudy.lesson3.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
/*
Напишите программу, которая считывает последовательность целочисленных значений
из стандартного ввода и находит среднее значение.
Детали:

1) Вы должны считывать значения последовательности, пока следующее не станет 0.
Нулевое значение означает конец входной последовательности и не является ее частью.
2) Последовательность гарантированно содержит хотя бы одно значение.
3) Среднее значение также является целым числом. Используйте целочисленные операции.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Scanner inputScanner = new Scanner(input);

        List<Integer> numbers = new ArrayList<>();
        int sum = 0;

        int value;
        while ((value = inputScanner.nextInt()) != 0) {
            numbers.add(value);
        }
        sc.close();
        inputScanner.close();

        for (Integer number : numbers) {
            sum += number;
        }

        int average = sum / numbers.size();

        System.out.println(numbers);
        System.out.println(average);

    }
}

class AnotherSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Scanner inputScanner = new Scanner(input);
        int sum = 0;

        int value;
        int counter = 0;

        while ((value = inputScanner.nextInt()) != 0) {
            sum += value;
            counter++;
        }
        sc.close();
        inputScanner.close();

        int average = sum / counter;
        System.out.println(average);
    }
}

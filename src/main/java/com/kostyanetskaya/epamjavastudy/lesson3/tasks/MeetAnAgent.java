package com.kostyanetskaya.epamjavastudy.lesson3.tasks;

import java.util.Scanner;

/*
Перейдите в класс MeetAnAgent и напишите программу, которая:

запрашивает на вход число-пароль
если оно равно секретному числу, программа выводит: "Hello, Agent"
в противном случае печатает: "Access denied".
Секретный пароль хранится в final static int password.
*/

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        //put you code here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}

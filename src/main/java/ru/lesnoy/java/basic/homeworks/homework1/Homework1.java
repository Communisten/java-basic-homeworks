package ru.lesnoy.java.basic.homeworks.homework1;

import javax.xml.stream.events.StartDocument;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Star();
        //greetings();
        //checkSign(1, 2, 3);
        //selectColor();
        //compareNumbers();
        //addOrSubtractAndPrint(1, 2, true);
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor() {
        int data = 7;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data < 20) {
            System.out.println("Желтый");
        } else if (data >= 20) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 7;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        }
        else {
            System.out.println(initValue - delta);
        }
    }
public static void Star() {
    Scanner scanner = new Scanner(System.in);
    int n;
    do {
        System.out.println("Введите число от 1 до 5");
        n = scanner.nextInt();
    } while (!(n >= 0 && n <= 5));
    System.out.println(n);
    int result;
    switch (n) {
        case 1:
            greetings();
            break;
        case 2:
            checkSign(1, 2, 3);
            break;
        case 3:
            selectColor();
            break;
        case 4:
            compareNumbers();
            break;
        case 5:
            addOrSubtractAndPrint(1, 2, true);
            break;
    }
}
}
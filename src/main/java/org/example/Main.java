// Задание №8

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        double y;

        if (x <= 8) {
            y = Math.acos(Math.exp(-Math.abs(x)));
        } else if (x > 8 && x < 9) {
            y = Math.cos(Math.pow(x, 5) / (7 + Math.pow(x, 2)));
        } else { // x >= 9
            y = Math.pow(x, 8) + Math.pow(x, x - 10);
        }

        System.out.println("Значение функции y(" + x + ") = " + y);

        scanner.close();
    }
}
package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double alpha = scan.nextDouble(), beta = scan.nextDouble(), x = scan.nextDouble(), y = scan.nextDouble();
        double z1, z2;

        System.out.println("ЗАДАНИЕ НА ВЫЧИСЛЕНИЕ Z1 И Z2:");
        //TODO Z1 Z2

        // 1
        z1 = Math.cos(alpha) + Math.sin(alpha) + Math.cos(3 * alpha) + Math.sin(3 * alpha);
        z2 = 0.25 - 0.25 * Math.sin((Math.PI * 5 / 2) - 8 * alpha);
        System.out.println("Задание 1.1");
        System.out.println(z1 + " " + z2);


        // 2
        z1 = Math.cos(alpha) + Math.sin(alpha) + Math.cos(3 * alpha) + Math.sin(3 * alpha);
        z2 = 2 * Math.sqrt(2) * Math.cos(alpha) * Math.sin(Math.PI / 4 + 2 * alpha);
        System.out.println("Задание 1.2");
        System.out.println(z1 + " " + z2);

        // 3
        z1 = (Math.sin(2 * alpha) + Math.sin(5 * alpha) - Math.sin(3 * alpha)) / (Math.cos(alpha) + 1 - 2 * Math.sin(2 * alpha) * Math.sin(2 * alpha));
        z2 = 2 * Math.sin(alpha);
        System.out.println("Задание 1.3");
        System.out.println(z1 + " " + z2);

        // 4
        z1 = (Math.sin(2 * alpha) + Math.sin(5 * alpha) - Math.sin(3 * alpha)) / (Math.cos(alpha) - Math.cos(3 * alpha) + Math.cos(5 * alpha));
        z2 = Math.atan(3 * alpha);
        System.out.println("Задание 1.4");
        System.out.println(z1 + " " + z2);

        // 5
        z1 = 1 - 0.25 * Math.sin(2 * alpha) * Math.sin(2 * alpha) + Math.cos(2 * alpha);
        z2 = Math.cos(alpha) * Math.cos(alpha) + Math.pow(Math.cos(alpha), 4);
        System.out.println("Задание 1.5");
        System.out.println(z1 + " " + z2);

        // 6
        z1 = Math.cos(alpha) + Math.cos(2 * alpha) + Math.cos(6 * alpha) + Math.cos(7 * alpha);
        z2 = 4 * Math.cos(alpha / 2) * Math.cos(5 / 2 * alpha) * Math.cos(4 * alpha);
        System.out.println("Задание 1.6");
        System.out.println(z1 + " " + z2);

        // 7
        z1 = Math.pow(Math.cos(3 / 8 * Math.PI - alpha / 4), 2) - Math.pow(Math.cos(11 / 8 * Math.PI + alpha / 4), 2);
        z2 = Math.sqrt(2) / 2 * Math.sin(alpha / 2);
        System.out.println("Задание 1.7");
        System.out.println(z1 + " " + z2);

        // 8
        z1 = Math.pow(Math.cos(x), 4) + Math.pow(Math.sin(y), 2) + 0.25 * Math.pow(Math.sin(2 * x), 2) - 1;
        z2 = Math.sin(x + y) * Math.sin(y - x);
        System.out.println("Задание 1.8");
        System.out.println(z1 + " " + z2);

        // 9
        z1 = Math.pow((Math.cos(alpha) - Math.cos(beta)), 2) - Math.pow((Math.sin(alpha) - Math.sin(beta)), 2);
        z2 = -4 * Math.pow(Math.sin((alpha - beta) / 2), 2) * Math.cos(alpha + beta);
        System.out.println("Задание 1.9");
        System.out.println(z1 + " " + z2);

        // 10
        z1 = (Math.sin(Math.PI / 2 + 3 * alpha) / (1 - Math.sin(3 * alpha - Math.PI)));
        z2 = Math.atan(5 / 4 * Math.PI + 3 / 2 * alpha);
        System.out.println("Задание 1.10");
        System.out.println(z1 + " " + z2);

        //TODO Задания системы

        System.out.println("ЗАДАНИЕ С СИСТЕМАМИ:");

        int a = scan.nextInt(), b = scan.nextInt(), x1 = scan.nextInt();

        // 1
        if (Math.sqrt(a + b) < x) {
            System.out.println(a * x * x + b * Math.log10(Math.abs(2 * x)));
        } else {
            System.out.println(Math.sqrt(a + Math.sin(2 * x)));
        }

        // 2
        if ((3 * a) > b) {
            System.out.println(Math.log10(x * x) - Math.exp(x / 3));
        } else {
            System.out.println(Math.atan(2 * x - 0.6));
        }

        // 3
        if ((3 * b * b) > a) {
            System.out.println(Math.exp(Math.sin(x) + b));
        } else {
            System.out.println(Math.exp(-1 * x) + a * Math.log10(x));
        }

        // 4
        if (Math.abs(a * a - b * b) > b) {
            System.out.println(Math.pow(a, x / 2) - Math.exp(Math.cos(x)));
        } else {
            System.out.println(Math.tan(4 * x) - a);
        }

        // 5
        if (Math.abs(a - b * b) > b) {
            System.out.println(Math.log(a * x - b) - Math.exp(Math.tan(x)));
        } else {
            System.out.println(Math.tan(4 * x) - a);
        }

        // 6
        if ((3 * a - b) > 0) {
            System.out.println(2 * Math.log10(x) - Math.exp((a * x - b) / 10));
        } else {
            System.out.println(Math.sin(x / 10));
        }

        // 7
        if ((a * x) < b) {
            System.out.println(Math.exp(-2 * x) + Math.pow((Math.pow(a, 4) + x), 1.0 / 4));
        } else {
            System.out.println(Math.sin(x) - b * b);
        }

        // 8
        if (a * b < 2 * x) {
            System.out.println(b * Math.exp(-3 * x) + Math.pow(Math.sin(a), 2));
        } else {
            System.out.println(Math.pow(x, 3) / a - (x / b));
        }

        // 9
        if (Math.sqrt(a + 3 * b) < 3 * x) {
            System.out.println(a * x * x + Math.tan(4 * x));
        } else {
            System.out.println(Math.sqrt(a + Math.sin(Math.abs(3 * x))));
        }

        // 10
        if ((3 * a) > (2 * b)) {
            System.out.println(Math.pow(Math.log10(x), 2) - Math.atan(x / 10));
        } else {
            System.out.println(Math.atan(2 * x - 0.6) + 2 * Math.log10(x));
        }
 
        //TODO Задание switch case

        System.out.println("ЗАДАНИЕ НА СТАРОСЛАВЯНСКИЙ КАЛЕНДАРЬ:");

        int num_of_year = scan.nextInt();

        switch (num_of_year % 12) {
            case (4):
                System.out.println("Год крысы");
                break;
            case (5):
                System.out.println("Год коровы");
                break;
            case (6):
                System.out.println("Год тигра");
                break;
            case (7):
                System.out.println("Год зайца");
                break;
            case (8):
                System.out.println("Год дракона");
                break;
            case (9):
                System.out.println("Год змеи");
                break;
            case (10):
                System.out.println("Год лошади");
                break;
            case (11):
                System.out.println("Год овцы");
                break;
            case (0):
                System.out.println("Год обезьяны");
                break;
            case (1):
                System.out.println("Год петуха");
                break;
            case (2):
                System.out.println("Год собаки");
                break;
            case (3):
                System.out.println("Год свиньи");
                break;
        }
    }
}
package com.company;

import java.util.Scanner;

public class Strings_Homework_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res = "";
        s = " " + s;

        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == ' ' || i == 0) {
                reverse(res);
                res = "";
            } else {
                res += s.charAt(i);
            }
        }

        System.out.println();
        res = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == ' ' || i == 0) {
                mirror(res);
                res = "";
            } else {
                res += s.charAt(i);
            }
        }
    }

    public static void mirror(String s) {
        System.out.print(s + " ");
    }

    public static void reverse(String s) {
        for (int i = s.length() - 1; i >= 0; --i) {
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
    }

}

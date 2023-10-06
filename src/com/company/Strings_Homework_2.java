package com.company;

import java.util.Scanner;

public class Strings_Homework_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        int max_len = 0;

        while (true) {
            String line = in.nextLine();
            line = line + " ";
            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ' ' && line.charAt(i) != ',') {
                    count++;
                } else {
                    max_len = Math.max(max_len, count);
                    count = 0;
                }
            }
            s += line + " ";
            if (line.charAt(line.length() - 2) == '.') break;
        }

        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            if ((int) s.charAt(i) <= 90 && (int) s.charAt(i) >= 65) {
                s = s.substring(0, i) + (char) (ascii_capital(max_len, ch)) + s.substring(i + 1);
            } else {
                if ((int) s.charAt(i) <= 122 && (int) s.charAt(i) >= 97) {
                    s = s.substring(0, i) + (char) (ascii_lowercase(max_len, ch)) + s.substring(i + 1);
                }
            }
        }

        System.out.println(s);
        System.out.println(max_len);
    }

    private static int ascii_capital(int k, int ch) {
        if (ch + k > 90) {
            return (64 + (k - (90 - ch)));
        } else {
            return (ch + k);
        }
    }

    private static int ascii_lowercase(int k, int ch) {
        if (ch + k > 122) {
            return (96 + (k - (122 - ch)));
        } else {
            return (ch + k);
        }
    }

}

package org.example.seminar2.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(increasingSequence(n));
    }

    public static boolean increasingSequence(int n) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 0;
        for (int i = 1; i < n; i++) {
            b = scan.nextInt();
            if (b <= a) {
                return false;
            }
        }
        return true;
    }
}


package org.example.seminar1.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int a = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int b = sc.nextInt();
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;
        }
        System.out.println("k : " + k);
        sc.close();
    }
}

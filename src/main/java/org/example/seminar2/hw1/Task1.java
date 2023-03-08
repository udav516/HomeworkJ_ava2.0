package org.example.seminar2.hw1;

import java.util.Scanner;

public class Task1 {
    //1) Дана последовательность N целых чисел. Найти сумму простых чисел.
    public static void main(String[] args) {
        System.out.println(sumPrimeNumbers());
    }

    public static int sumPrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int suma = 0;
        for (int i = 2; i <= n; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                suma += i;
            }
        }
        return suma;
    }
}

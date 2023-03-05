package org.example.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        getSum();
    }
    public static void getSum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (array[i] == 0) {break;}
            if (array[i] == -1) {sum += array[i - 1];}
        }
        System.out.println(sum);
    }
}

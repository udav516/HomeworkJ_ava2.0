package org.example.seminar1.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения цифр (ввод 0 прекратит этот цикл): ");
        int sum = 0;
        int num = scanner.nextInt();
        while (num != 0) {
            int lastNum = num;
            num = scanner.nextInt();
            if (num != 0){
                if(lastNum > 0 && num < 0){
                    sum+=lastNum;
                }
            }
        }
        System.out.printf("Сумма равна %d",sum);
        scanner.close();
    }
}

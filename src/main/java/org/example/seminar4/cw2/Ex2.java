package org.example.seminar4.cw2;

import java.util.*;

/**
 * Построить однонаправленный список целых чисел. Найти сумму чётных значений списка.
 */
public class Ex2 {
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sum = 0;
        for (Integer el : someList) {
            if (el % 2 == 0) {
                sum += el;
            }
        }
        System.out.println(sum);
    }
}

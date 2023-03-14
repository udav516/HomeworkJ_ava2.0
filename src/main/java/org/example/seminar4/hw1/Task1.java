package org.example.seminar4.hw1;

import java.util.*;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(reverseList(linkedList));
    }

    /**
     * @param linkedList список чисел в одном порядке
     * @return перевёрнутый список
     */
    private static List<Integer> reverseList(List<Integer> linkedList) {
        List<Integer> revList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            revList.add(linkedList.get(i));
        }
        return revList;
    }
}

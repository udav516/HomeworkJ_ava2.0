package org.example.seminar4.hw2;

import java.util.*;

/**
 * Задана строка s содержащий только символы '(', ')', '{', '}', '[' и ']',
 * определите, является ли введенная строка допустимой.
 */
public class Task2 {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }

    /**
     * @param s символы в строке
     * @return булевое значение
     */
    public static boolean isValid(String s) {
        Deque<Character> list = new LinkedList<>();
        if (s.length() < 2) return false;
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '[' || i == '{') {
                list.add(i);
            } else if (i == ')') {
                if (list.pop() != '(') return false;
            } else if (i == ']') {
                if (list.pop() != '[') return false;
            } else if (i == '}') {
                if (list.pop() != '{') return false;
            }
        }
        return true;
    }
}

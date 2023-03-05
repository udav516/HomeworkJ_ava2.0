package org.example.hw1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(revWords("the sky is blue"));
    }
    public static String revWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String[] array = s.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            if (!array[i].isEmpty()) {
                reverse.append(array[i]).append(" ");
            }
        }
        return reverse.length() == 0 ? "" : reverse.substring(0, reverse.length() - 1);
    }
}

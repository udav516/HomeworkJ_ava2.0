package org.example.seminar5.hw2;

import java.util.*;

/**
 * Подсчитать количество искомого слова,
 * через map (наполнением значение, где искомое слово будет являться ключом),
 * вносить все слова не нужно
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> ourWords = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String rep = str.replace(".", "")
                .replace("— ", "");
        String[] arr = rep.split(" ");

        for (String s : arr) {
            if (!ourWords.containsKey(s.toLowerCase())) {
                ourWords.putIfAbsent(s.toLowerCase(), 1);
            } else {
                ourWords.put(s.toLowerCase(), ourWords.get(s.toLowerCase()) + 1);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово для подсчета нахождений");
        String keyWord = sc.nextLine().toLowerCase();
        System.out.printf("Слово " + keyWord + " в тексте встречается " + ourWords.get(keyWord) + " раз");
    }
}

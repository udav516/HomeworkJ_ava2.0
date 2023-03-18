package org.example.seminar5.hw1;

import java.util.*;

/**
 * Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)*
 */
public class Task1 {
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
        for (var entry : ourWords.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " раз ");
        }
    }
}
//toLoverCase()
//String result = yourString.replaceAll("[-+.^:,]","");

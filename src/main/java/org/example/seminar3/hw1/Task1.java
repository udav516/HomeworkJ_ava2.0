package org.example.seminar3.hw1;

import org.example.seminar3.hw1.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task1 {
    public static void main(String[] args) {
        Items item1 = new Items("Хлеб", 44.99, 1);
        Items item2 = new Items("Сахар", 55.99, 1);
        Items item3 = new Items("Мука высший сорт", 74.99, 3);
        Items item4 = new Items("Бульмени высший сок", 169.99, 1);
        Items item5 = new Items("Соль йодированная высший помол", 57.0, 2);
        Items item6 = new Items("Яблоки высший сорт", 236.99, 2);
        Items item7 = new Items("Бройлер королевский высший сорт", 324.99, 2);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        itemsList.add(item7);

        String searchName = "высший";
        Double maxPrice = 0.0;
        StringBuilder maxPriceSortedNames = new StringBuilder();

        for (Items items : itemsList) {
            if (items.getName().toLowerCase().contains(searchName) && (items.getSort() == 1 || items.getSort() == 2)) {
                if (maxPrice < items.getPrice()) {
                    maxPrice = items.getPrice();
                }
            }
        }

        for (Items items : itemsList) {
            if (items.getName().toLowerCase().contains(searchName) && (items.getSort() == 1 || items.getSort() == 2)) {
                if (Objects.equals(items.getPrice(), maxPrice)) {

                    maxPriceSortedNames.append(items.getName()).append("\n");
                }
            }
        }
        System.out.println("Самые дорогие товары первого и второго сорта, в названии которых есть слово 'высший': ");
        System.out.println(maxPriceSortedNames);
        System.out.println("Наибольшая цена: " + maxPrice);
    }
}

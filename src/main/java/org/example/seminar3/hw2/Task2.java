package org.example.seminar3.hw2;

import org.example.seminar3.hw2.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Items item1 = new Items("Манго", "Тайланд", 290.23, 329.99, 1);
        Items item2 = new Items("Авокадо", "Тайланд", 200.99, 225.0, 3);
        Items item3 = new Items("Масло", "Россия", 190.99, 180.0, 2);
        Items item4 = new Items("Картошка", "Белорусия", 54.99, 1000.0, 1);
        Items item5 = new Items("Хлеб", "Россия", 45.99, 400.0, 2);
        Items item6 = new Items("Айран", "Казахстан", 20.99, 523.05, 1);
        Items item7 = new Items("Устрицы королевские высший свет", "Тайланд", 490.23, 800.0, 1);
        Items item8 = new Items("Айран2", "Казахстан", 20.99, 523.05, 1);

        List<Items> itemsList = new ArrayList<>();

        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        itemsList.add(item7);
        itemsList.add(item8);

        System.out.println(itemsList);
        int ourSort = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("Введите номер сорта (1, 2, 3)");
            String sort = scanner.nextLine();
            try {
                if (Integer.parseInt(sort) > 0 && Integer.parseInt(sort) <= 3) {
                    flag = false;
                    ourSort = Integer.parseInt(sort);
                }
            } catch (Exception e) {
                System.out.println("Это не число 1, 2, 3. Попробуйте еще раз.");
            }
        }
        scanner.close();

        double minPrice = itemsList.get(0).getPrice();
        for (Items items2 : itemsList) {

            if (items2.getSort().equals(ourSort)) {
                if (items2.getPrice() < minPrice) {
                    minPrice = items2.getPrice();
                }
            }
        }
        StringBuilder ourNames = new StringBuilder();
        for (Items items2 : itemsList) {

            if (items2.getSort().equals(ourSort) && (items2.getPrice() == minPrice)) {
                ourNames.append(items2.getName()).append("\n");
            }
        }
        System.out.println("Самые бюджетные товары сорта " + ourSort + ": \n" + ourNames);


    }
}

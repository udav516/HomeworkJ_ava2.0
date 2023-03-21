package org.example.seminar6.hw1;

import org.example.seminar6.hw1.model.Filter;
import org.example.seminar6.hw1.model.Laptop;

import java.util.*;

/**
 * Задание на дом :
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
 * Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Task1 {
    public static void main(String[] args) {
        Laptop aser = new Laptop(4, 128, "ios", "чёрный");
        Laptop tecno = new Laptop(8, 256, "Linux", "синий");
        Laptop apple = new Laptop(16, 512, "macOS", "белый");
        Laptop lenovo = new Laptop(32, 1024, "Windows 10", "серый");
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(aser);
        laptops.add(tecno);
        laptops.add(apple);
        laptops.add(lenovo);
        Laptop FilterLaptop = new Laptop();
        System.out.println("по вашему запросу найдено: " + Filter.filter(laptops));
        System.out.println(FilterLaptop.laptopList(laptops));
    }
}

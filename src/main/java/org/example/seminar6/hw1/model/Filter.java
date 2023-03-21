package org.example.seminar6.hw1.model;

import java.util.*;

public class Filter {
    public static Set<Laptop> filter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println("""
                Здрасвуйте, Укажите номер или номера критериев фильрации ноутбуков,
                1. ОЗУ
                2. Объем ЖД
                3. Операционная система
                4. Цвет""");
        String userRequest = scan.nextLine();

        for (int i = 0; i < userRequest.length(); i++) {
            if (1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 4, 8, 16, 32");
                int enterOperativeMemory = scan.nextInt();
                for (Laptop tempLaptop : laptop) {
                    if (enterOperativeMemory == tempLaptop.ram) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
            if (2 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите размер жёсткого диска в гб\nВналичии : 128, 256, 512, 1024");
                String enterHardDisk = scan.nextLine();
                int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
                for (Laptop tempLaptop : laptop) {
                    if (intParseEnterHardDisk != tempLaptop.ssd) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
            if (3 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите операционную систему\nВналичии : Linux, macOS, Windows 10, ios");
                String enterOperatingSystem = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((!enterOperatingSystem.equals(tempLaptop.os))) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if (4 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите цвет ноутбука\nВналичии : чёрный, синий, белый, серый");
                String enterColor = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if (!(enterColor.equals(tempLaptop.color))) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        return listLaptop;
    }
}

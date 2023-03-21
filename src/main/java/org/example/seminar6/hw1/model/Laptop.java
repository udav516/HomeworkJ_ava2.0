package org.example.seminar6.hw1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@AllArgsConstructor
@Data
public class Laptop {
    int ram;
    int ssd;
    String os;
    String color;

    public Laptop() {
    }

    public List<Laptop> laptopList(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Укажите параметры для ноутбука.
                Укажите размер жёсткого диска в гб
                Вналичии : 128,256,512,1024""");
        String enterHardDisk = scan.nextLine();
        int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
        System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 4, 8, 16, 32");
        int enterOperativeMemory = scan.nextInt();
        System.out.println("Укажите операционную систему\nВналичии : Linux, macOS, Windows 10, ios");
        String enterOperatingSystem = scan.next();
        System.out.println("Укажите цвет ноутбука\nВналичии : чёрный, синий, белый, серый");
        String enterColor = scan.next();
        List<Laptop> listLaptop = new ArrayList<>();
        for (Laptop tempLaptop : laptop) {
            if (intParseEnterHardDisk == tempLaptop.ssd) {
                if (enterOperativeMemory == tempLaptop.ram) {
                    if (enterOperatingSystem.equals(tempLaptop.os)) {
                        if (enterColor.equals(tempLaptop.color)) {
                            listLaptop.add(tempLaptop);
                        }
                    }
                }
            }
        }
        return listLaptop;
    }

    @Override
    public String toString() {
        return "\nжёсткий диск = " + ssd + ",\nоперативная память = " + ram
                + ",\nоперационная система = " + os + ",\nцвет = " + color + "\n";
    }
}

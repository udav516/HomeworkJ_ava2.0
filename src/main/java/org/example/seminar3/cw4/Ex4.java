package org.example.seminar3.cw4;

import org.example.seminar3.cw4.model.Cube;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.HashSet;

public class Ex4 {
    public static void main(String[] args) {
        Cube cube1 = new Cube("зеленый", 13, "деревянный");
        Cube cube2 = new Cube("желтый", 73, "металлический");
        Cube cube3 = new Cube("красный", 23, "картонный");
        Cube cube5 = new Cube("красный", 23, "картонный");
        Cube cube6 = new Cube("красный", 23, "картонный");
        Cube cube4 = new Cube("желтый", 3, "металлический");

        List<Cube> listCube = new ArrayList<>();
        listCube.add(cube1);
        listCube.add(cube2);
        listCube.add(cube3);
        listCube.add(cube4);
        listCube.add(cube5);
        listCube.add(cube6);
        System.out.println("коллекция " + listCube.size());
        System.out.println("уникальная коллекция : " + unicumCollections(listCube).size());

    }

    private static Collection<Cube> unicumCollections(List<Cube> listCube) {
        return new HashSet<>(listCube);
    }
}

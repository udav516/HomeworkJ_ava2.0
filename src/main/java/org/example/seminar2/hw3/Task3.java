package org.example.seminar2.hw3;

public class Task3 {
    //3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
    public static void main(String[] args) {
        int[] array = new int[]{-5, 8, -2, 6, -1, 3, -7, 4, -9, 11};
        replaceNegative(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        StringBuilder res = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            res.append(array[i]).append(i == array.length - 1 ? "]" : ",");
        }
        System.out.println(res);
    }

    public static void replaceNegative(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if ((10 <= array[i] && array[i] <= 99) || (-99 <= array[i] && array[i] <= -10)) {
                sum += i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = sum;
        }

    }
}

package org.example.hw3;

//3.* Даны две двоичные строки a и b, вернуть их сумму в виде двоичной строки.
//Ввод: a = "11", b = "1"
//Вывод: "100"
//Ввод: a = "1010", b = "1011"
//Вывод: "10101"
public class Task3 {
    public static void main(String[] args){
        addBinary();
    }
    public static void addBinary(){
        String input0 = "11";
        String input1 = "1";
        int number0 = Integer.parseInt(input0, 2);
        int number1 = Integer.parseInt(input1, 2);
        int sum = number0 + number1;
        System.out.printf(Integer.toBinaryString(sum)); //returns the answer as a binary value;
    }
}
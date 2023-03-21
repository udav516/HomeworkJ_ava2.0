package org.example.seminar6.cw4;

import org.example.seminar6.cw4.model.Celsius;
import org.example.seminar6.cw4.model.Farenheit;
import org.example.seminar6.cw4.model.Kelvin;

/**
 * 4)Напишите интерфейс Converter для конвертации из градусов по Цельсию в Кельвины, Фаренгейты.
 * У классов наследников необходимо переопределить метод интерфейса, для валидного перевода величин.
 * Метод для конвертации назовите "convertValue".
 */

public class Ex4 {
    public static void main(String[] args) {
        Double t = 36.6;
        Double tFar = new Farenheit().convert(t);
        System.out.println(tFar);
        Double tKel = new Kelvin().convert(-273.);
        System.out.println(tKel);
        Double tCelsius = new Celsius().convert(t);
        System.out.println(tCelsius);

    }
}

package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Class FuncDiapason2 практика работы с функциональными интерфейсами 1) создание класса (#111)
 * @author Sergei Begletsov
 * @since 25.08.2021
 * @version 1
 */

public class FuncDiapason2 {
    /**
     * Подсчет функции func в диапазоне
     * @param start начало диапазона
     * @param end конец диапазона
     * @param func функция расчета
     * @return список значений функции в точках
     */
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (double i = start; i < end; i++) {
            rsl.add(func.apply(i));
        }
        return rsl;
    }
}

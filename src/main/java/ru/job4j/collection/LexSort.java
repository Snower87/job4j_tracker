package ru.job4j.collection;

import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * Класс LexSort реализует сравнение строк по начальному номеру 1) реализация компаратора по первоначальному числу (#100)
 * 2) реализовал другой вариант сравнения через split(), добавил тест (#101)
 * @author Sergei Begletsov
 * @since 18.08.2021
 * @version 2
 */

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        //1. Парсинг строки через метод split()
        String[] intLeft  = left.split(". ", 2);
        String[] intRight = right.split(". ", 2);

        //2. Возвращаю результат сравнения 2х чисел,
        //   которые находятся в начале массива
        return Integer.compare(Integer.parseInt(intLeft[0]), Integer.parseInt(intRight[0]));
    }
}

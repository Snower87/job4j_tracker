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
        String[] intLeft  = left.split(". ", 2);
        String[] intRight = right.split(". ", 2);

        return Integer.compare(Integer.parseInt(intLeft[0]), Integer.parseInt(intRight[0]));
    }
}

package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Class ListSort встроенная сортировка по-умолчанию в Java 1) практика работы с алгоритмами сортировки (#95)
 * @author Sergei Begletsov
 * @since 15.08.2021
 * @version 1
 */

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 4, 2, 1);
        System.out.println("Before sort: " + list);
        Collections.sort(list);
        System.out.println("After sort: " + list);
        Integer first = 1;
        Integer second = 2;
        int rsl = first.compareTo(second);
        System.out.println("first.compareTo(second): " + rsl);
    }
}

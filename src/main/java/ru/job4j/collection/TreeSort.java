package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class TreeSort стандартная сортировка набора Set 1) сортировка TreeSet происходит по-возрастанию (по-умолчанию) (#96)
 * @author Sergei Begletsov
 * @since 16.08.2021
 * @version 1
 */

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        System.out.println(numbers);
    }
}

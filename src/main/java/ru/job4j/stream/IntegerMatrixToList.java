package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс IntegerMatrixToList преобразует массив Integer[][] в список List
 * 1) создание класса (#121)
 * @author Sergei Begletsov
 * @since 04.09.2021
 * @version 1
 */

public class IntegerMatrixToList {
    /**
     * Преобразует массив чисел Integer в список
     * @param matrix входной массив чисел Integer
     * @return список чисел Integer
     */
    public static List<Integer> convert(Integer[][] matrix) {
        return Arrays.stream(matrix)
                    .flatMap(e -> Arrays.stream(e))
                    .collect(Collectors.toList());
    }
}

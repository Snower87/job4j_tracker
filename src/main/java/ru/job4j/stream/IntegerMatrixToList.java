package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс IntegerMatrixToList преобразует массив Integer[][] в список List
 * 1) создание класса (#121) 2) переход с Arrays.stream(array) -> Stream.of(array)
 * @author Sergei Begletsov
 * @since 04.09.2021
 * @version 2
 */

public class IntegerMatrixToList {
    /**
     * Преобразует массив чисел Integer в список
     * @param matrix входной массив чисел Integer
     * @return список чисел Integer
     */
    public static List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}

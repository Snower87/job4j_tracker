package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Раздел Блок 3. Collections. Lite / 1. Коллекция List, ArrayList
 * @Задание 5. Конвертация листа массивов в один лист Integer. [#10037 #23669]
 * @Описание 1. В этом задании необходимо реобразовать список с массивом чисел в список чисел.
 * Реализуйте данный функционал в методе convert(List<int[]> list)
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 10.08.2021
 * @version 1
 */

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rsl.add(cell);
            }
        }
        return rsl;
    }
}

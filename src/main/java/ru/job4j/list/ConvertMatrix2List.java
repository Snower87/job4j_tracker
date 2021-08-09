package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Раздел Блок 3. Collections. Lite / 1. Коллекция List, ArrayList
 * @Задание 4. Конвертация двумерного массива в ArrayList. [#48580 #23671]
 * @Описание 1. В этом задании необходимо реализовать обратную конвертацию двухмерного массива в одномерный список.
 * Реализуйте данный функционал в методе toList(int[][] array).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 09.08.2021
 * @version 1
 */

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}

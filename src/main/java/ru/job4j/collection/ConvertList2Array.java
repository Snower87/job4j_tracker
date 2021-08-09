package ru.job4j.collection;

import java.util.List;

/**
 * @Раздел Блок 3. Collections. Lite / 1. Коллекция List, ArrayList
 * @Задание 3. Конвертация ArrayList в двухмерный массив. [#10035 #23668]
 * @Описание 1. Реализуйте метод конвертации списка чисел в двухмерный массив чисел.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 09.08.2021
 * @version 1
 */

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
            if (cell < cells - 1) {
                cell++;
            } else {
                row++;
                cell = 0;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

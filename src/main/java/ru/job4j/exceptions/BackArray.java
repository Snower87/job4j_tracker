package ru.job4j.exceptions;

import java.util.Arrays;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0. Что такое исключение. [3821#271529]
 * @Описание 1. Приведен класс ru.job4j.ex.BackArray с методом main. Запустите этот класс и найдите в нем ошибку.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.06.2021
 * @version 1
 */

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index <= middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - index - 1];
            names[names.length - index - 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}

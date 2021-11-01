package ru.job4j.exceptions;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0.2. Кидаем исключение - throw new RuntimeException. [219365#271522]
 * @Описание 1. Практика работы с исключениями (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.06.2021
 * @version 1
 */

public class Count {
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less then finish.");
        }
        int rsl = 0;
        for (int index = start; index != finish; index++) {
            rsl += index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is : " + add(2, 10));
    }
}

package ru.job4j.exceptions;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0. Что такое исключение. [3821#271529]
 * @Описание 1. Практика работы с исключениями (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.06.2021
 * @version 1
 */

public class FrequentEx {
    public static void main(String[] args) {
        String[] shops = {"Ebay", "Amazon", "Ozon"};
        for (int index = 0; index < shops.length; index++) {
            System.out.println(shops[index]);
        }
    }
}

package ru.job4j.exceptions;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0.1. java.lang.NullPointerException. [219364#271521]
 * @Описание 1. Ниже представлен класс ru.job4j.ex.FindMaxLenght. Запустите этот класс.
 * 2. Выполнение программы прервется с исключением NPE. Вам нужно поправить эту проблему.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.06.2021
 * @version 1
 */

public class FindMaxLenght {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if ((el != null) && (el.length() > max)) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}

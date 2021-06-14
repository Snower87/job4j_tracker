package ru.job4j.exceptions;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0.2. Кидаем исключение - throw new RuntimeException. [219365#271522]
 * @Описание 1. Посмотрите на класс вычисления факториала.
 * 2. Добавьте проверку входного параметра в метод calc. Если n < 0, то нужно прервать программу
 *    с исключением IllegalArgumentException.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.06.2021
 * @version 1
 */

public class Fact {
    public static void main(String[] args) {
        System.out.println(new Fact().calc(5)); //вызовет исключение -> IllegalArgumentException
        //System.out.println(new Fact().calc(-1)); //вызовет исключение -> IllegalArgumentException
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The parameter \"n\" must be greater than zero");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}

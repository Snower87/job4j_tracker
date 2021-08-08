package ru.job4j.collection;

import java.util.ArrayList;

/**
 * @Раздел Блок 3. Collections. Lite / 1. Коллекция List, ArrayList
 * @Задание 0. Коллекции, ArrayList, List, Обобщения. [#10094 #23667]
 * @Описание 1. Создайте класс ru.job4j.collection.UsageArrayList. В нем создайте метод main.
 * 2. В методе main создайте объект ArrayList с типом String. Добавьте в него 3 имени: Petr, Ivan, Stepan.
 * Далее через цикл for-each выведите все элементы на консоль.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 08.08.2021
 * @version 1
 */

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");

        //Вариант №1 вывода на консоль (for-each)
        System.out.println("Вариант №1 вывода на консоль:");
        System.out.println("стандартно через цикл for и типу String");
        for (String name: names) {
            System.out.println(name);
        }

        //Вариант №2 вывода на консоль (for-Object)
        System.out.println();
        System.out.println("Вариант №2 вывода на консоль");
        System.out.println("через приведение к типу Object (повышение по иерархии)");
        for (Object value: names) {
            System.out.println(value);
        }

        //Вариант №3 вывода на консоль (через index)
        System.out.println();
        System.out.println("Вариант №3 вывода на консоль:");
        System.out.println("через метод get() и размер списка size");
        for (int index = 0; index < names.size(); index++) {
            Object value = names.get(index);
            System.out.println(value);
        }
    }
}
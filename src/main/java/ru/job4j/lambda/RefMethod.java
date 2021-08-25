package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Class RefMethod практика работы с ссылками на методы 1) создание класса (#109)
 * @author Sergei Begletsov
 * @since 25.08.2021
 * @version 1
 */

public class RefMethod {
    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "...");
        } else {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentiev"
        );
        //Пример 1. Использование ссылок на стандартные методы java
        System.out.println("Example1:");
        //было
        Consumer<String> consumer = (name) -> System.out.println(name);
        names.forEach(consumer);
        //стало
        Consumer<String> consumer2 = System.out::println;
        names.forEach(consumer2);

        //Пример 2. Использование ссылок на стандартные методы java
        //было
        Comparator<Integer> intComp = (left, right) -> Integer.compare(left, right);
        //стало
        Comparator<Integer> intComp2 = Integer::compare;

        //Пример 3. Использование ссылок на самописный метод
        System.out.println();
        System.out.println("Example3:");
        //было
        Consumer<String> method = (name) -> cutOut(name);
        names.forEach(method);
        //стало
        Consumer<String> method2 = RefMethod::cutOut;
        names.forEach(method2);
    }
}
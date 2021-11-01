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
        System.out.println("Example1:");
        Consumer<String> consumer = (name) -> System.out.println(name);
        names.forEach(consumer);
        Consumer<String> consumer2 = System.out::println;
        names.forEach(consumer2);

        Comparator<Integer> intComp = (left, right) -> Integer.compare(left, right);
        Comparator<Integer> intComp2 = Integer::compare;

        System.out.println();
        System.out.println("Example3:");
        Consumer<String> method = (name) -> cutOut(name);
        names.forEach(method);
        Consumer<String> method2 = RefMethod::cutOut;
        names.forEach(method2);
    }
}
package ru.job4j.map;

import java.util.stream.Stream;

/**
 * Класс DoubleLoop практика работы с методом flatMap
 * 1) создание класса (#125)
 * @author Sergei Begletsov
 * @since 07.09.2021
 * @version 1
 */

public class DoubleLoop {
    public static void main(String[] args) {
        String[] levels = {"level 1", "level 2", "level 3"};
        String[] tasks = {"task 1", "task 2", "task 3", "task 4"};
        for (String level : levels) {
            for (String task : tasks) {
                System.out.println(level + " " + task);
            }
        }
        System.out.println();

        Stream.of(levels)
                .flatMap(level -> Stream.of(tasks)
                       .map(task -> level + " " + task))
                .forEach(System.out::println);
    }
}

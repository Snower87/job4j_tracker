package ru.job4j.stream;

import java.util.List;
import java.util.stream.Stream;

/**
 * Класс UpgradeStreamAPI практика работы с улучшениями Stream API
 * 1) создание класса (#133)
 * @author Sergei Begletsov
 * @since 01.11.2021
 * @version 1
 */

public class UpgradeStreamAPI {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 5, 6).stream()
                .dropWhile(v -> v < 5)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::println);

        Stream.of(1, null, 2, null, 3)
                .flatMap(Stream::ofNullable)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::println);

        List.of(1, 2, 3, 4).stream()
                .takeWhile(e -> e < 3)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::println);
    }
}

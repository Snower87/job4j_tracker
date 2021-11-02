package ru.job4j.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Class OptStream практика работы с Optional и Stream
 * 1) создание класса (#112)
 * @author Sergei Begletsov
 * @since 02.11.2021
 * @version 1
 */

public class OptStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Optional<Integer> rsl = stream.filter(e -> e == 5).findFirst();
        if (rsl.isPresent()) {
            System.out.println(rsl.get());
        } else {
            System.out.println("Element not found.");
        }
    }
}

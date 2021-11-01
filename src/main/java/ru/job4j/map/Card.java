package ru.job4j.map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс Card описывает колоду карт
 * 1) создание класса (#125) 2) создание объектов типа Card в потоке (#127)
 * 3) commit для закрытия задачи (#130) 4) переопределил метод toString() (#132)
 * @author Sergei Begletsov
 * @since 07.09.2021
 * @version 3
 */

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    @Override
    public String toString() {
        return suit + ": " + value;
    }

    public static void main(String[] args) {
        Stream.of(Suit.values()).forEach(System.out::println);
        System.out.println();

        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                            .map(value -> new Card(suit, value)))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}


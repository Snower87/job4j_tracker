package ru.job4j.map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс Card описывает колоду карт
 * 1) создание класса (#125) 2) создание объектов типа Card в потоке
 * @author Sergei Begletsov
 * @since 07.09.2021
 * @version 2
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

    public static void main(String[] args) {
        //1. Вывод всех перечислений Suit через Stream
        Stream.of(Suit.values()).forEach(System.out::println);
        System.out.println();

        //2. Вывод геренации колоды карт
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                            .map(value -> new Card(suit, value)))
                .collect(Collectors.toList())
                .forEach(card -> System.out.println(card.suit + ": " + card.value));
    }
}


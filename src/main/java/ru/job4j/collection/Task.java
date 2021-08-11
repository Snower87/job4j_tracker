package ru.job4j.collection;

/**
 * Класс-данных под уникальные задачи 1) практика работы с коллекциями List, Set (#86)
 * @author Sergei Begletsov
 * @since 11.08.2021
 * @version 1
 */

public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
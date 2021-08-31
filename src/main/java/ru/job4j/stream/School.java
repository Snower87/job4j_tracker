package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Класс-сервис School фильтрует список учеников по баллам
 * 1) создание класса (#116)
 * @author Sergei Begletsov
 * @since 31.08.2021
 * @version 1
 */

public class School {
    /**
     * Получить список студентов, проходящих по баллам
     * @param students входной список студентов под сортировку
     * @param predicate условие по которому распределяются студенты
     * @return список учеников, которые подходят по условию
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
package ru.job4j.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Класс-сервис StudentLevel получает список студентов по уровню проходного балла
 * 1) создание класса (#133)
 * @author Sergei Begletsov
 * @since 01.11.2021
 * @version 1
 */

public class StudentLevel {
    /**
     * Получить список студентов, проходящих по баллам
     * @param students входной список студентов
     * @param bound проходной балл
     * @return список студентов, подходящих под проходной балл
     */

    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(flt -> Objects.nonNull(flt))
                .sorted((left, right) -> left.getSurname().compareTo(right.getSurname()))
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}

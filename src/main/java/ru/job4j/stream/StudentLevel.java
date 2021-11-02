package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Класс-сервис StudentLevel получает список студентов по уровню проходного балла
 * 1) создание класса (#133) 2) изменил сортировку по имени -> на проходной балл (по убыванию) (#134)
 * 3) переписал компаратор для сортировки с лямбды на ссылку на метод getScore (#138)
 * @author Sergei Begletsov
 * @since 01.11.2021
 * @version 3
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
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}

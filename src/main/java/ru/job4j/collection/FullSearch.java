package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 /* Класс FullSearch выделяет из списка уникальные задачи 1) практика работы с коллекциями List, Set (#86)
 * @author Sergei Begletsov
 * @since 11.08.2021
 * @version 1
 */

public class FullSearch {
    /**
     * Метод добавляет заявки в хранилище
     * @param list список задач входных
     * @return список, в котором нет повторяющихся задач
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task: list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}

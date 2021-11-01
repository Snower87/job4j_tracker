package ru.job4j.search;

import java.util.LinkedList;

/**
 * @Раздел Блок 3. Collections. Lite / 1. Коллекция List, ArrayList
 * @Задание 2. Очередь с приоритетом на LinkedList. [#41670 #23673]
 * @Описание 1. Реализуйте метод put, который должен вставлять в нужную позицию элемент в зависимости от приоритета
 * в классе PriorityQueue.
 * 2. Очередь с приоритетами - это коллекция, в которой элементы при добавлении располагаются в определенном порядке.
 * Это позволяет их извлекать в нужном порядке. Например. У нас есть список задач на день с указанием их важности.
 * Мы бы хотели выполнять задачи по их важности.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * 2) рефакторинг, перевод пар-ов на тип var (#136)
 * @author Sergei Begletsov
 * @since 09.08.2021
 * @version 2
 */

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (element.getPriority() <= task.getPriority()) {
                index++;
            }
        }
        this.tasks.add(index, task);
    }

    /**
     * Метод возвращает первый элемент из списка и удаляет его
     * @return возвращает первый элемент
     */
    public Task take() {
        return tasks.poll();
    }
}

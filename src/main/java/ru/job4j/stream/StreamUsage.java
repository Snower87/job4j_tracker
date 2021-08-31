package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class StreamUsage практика работы с потоками 1) создание класса (#114)
 * @author Sergei Begletsov
 * @since 31.08.2021
 * @version 1
 */

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", spent=" + spent +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100),
                new Task("Task #4", 100),
                new Task("Bug #5", 100),
                new Task("Task #2", 50),
                new Task("Task #4", 50)
        );

        //==========================================
        //        1-ый этап (Фильтрация)
        //==========================================
        //1 Вариант. Аналог с циклом for-each, где: for - stream, if - predicate.
        List<Task> container = new ArrayList<>();
        for (Task task: tasks) {
            if (task.name.contains("Bug")) {
                container.add(task);
            }
        }
        //2 Вариант. Фильтрация через интерфейс потока stream
        List<Task> bugs = tasks.stream().filter(task -> task.name.contains("Bug"))
                                        .collect(Collectors.toList());
        System.out.println("Stage 1. Фильтрация");
        bugs.forEach(System.out::println);
        System.out.println();

        //==========================================
        //       2-ой этап (Преобразование)
        //==========================================
        //1 Вариант. Аналог с циклом for-each
        List<String> container2 = new ArrayList<>();
        for (Task task: tasks) {
            container2.add(task.name);
        }
        //1 Вариант. Преобразование, получение имен задач
        List<String> names = tasks.stream().map(task -> task.name)
                                           .collect(Collectors.toList());
        System.out.println("Stage 2. Преобразование");
        names.forEach(System.out::println);
        System.out.println();

        //==========================================
        //       3-ий этап (Упрощение)
        //==========================================
        //1 Вариант. Аналог с циклом for-each
        long total2 = 0L;
        for (Task task: tasks) {
            total2 += task.spent;
        }
        //2 Вариант. Подсчет общего времени, потраченное на все задачи
        long total = tasks.stream().map(task -> task.spent)
                                   .reduce(0L, Long::sum);
        System.out.println("Stage 3. Упрощение");
        System.out.println("total time: " + total);
        System.out.println();

        //==========================================
        //       4-ый этап (Аккумуляция)
        //==========================================
        //Аккумуляция - это запись элементов потока в коллекцию.
        List<Task> bugs2 = tasks.stream().filter(task -> task.name.contains("Bug"))
                                         .collect(Collectors.toList());
        System.out.println("Stage 4. Аккумуляция");
        bugs2.forEach(System.out::println);
        System.out.println();

        //==========================================
        //          Задание на потоки
        //==========================================
        List<Integer> integers = Arrays.asList(10, 5, 6, -2, -12, 145);
        List<Integer> integerList = integers.stream().filter(num -> num > 0)
                                                     .collect(Collectors.toList());
        System.out.println("Задание на потоки:");
        integerList.forEach(System.out::println);
    }
}

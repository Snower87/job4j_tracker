package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class StreamUsage практика работы с потоками 1) создание класса (#114) 2) рефакторинг + задание 0.1 (#115)
 * @author Sergei Begletsov
 * @since 31.08.2021
 * @version 2
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

        List<Task> container = new ArrayList<>();
        for (Task task: tasks) {
            if (task.name.contains("Bug")) {
                container.add(task);
            }
        }
        List<Task> bugs = tasks.stream()
                                .filter(task -> task.name.contains("Bug"))
                                .collect(Collectors.toList());
        System.out.println("Stage 1. Фильтрация");
        bugs.forEach(System.out::println);
        System.out.println();

        List<String> container2 = new ArrayList<>();
        for (Task task: tasks) {
            container2.add(task.name);
        }
        List<String> names = tasks.stream()
                                    .map(task -> task.name)
                                    .collect(Collectors.toList());
        System.out.println("Stage 2. Преобразование");
        names.forEach(System.out::println);
        System.out.println();

        long total2 = 0L;
        for (Task task: tasks) {
            total2 += task.spent;
        }
        long total = tasks.stream()
                            .map(task -> task.spent)
                            .reduce(0L, Long::sum);
        System.out.println("Stage 3. Упрощение");
        System.out.println("total time: " + total);
        System.out.println();

        List<Task> bugs2 = tasks.stream()
                                   .filter(task -> task.name.contains("Bug"))
                                   .collect(Collectors.toList());
        System.out.println("Stage 4. Аккумуляция");
        bugs2.forEach(System.out::println);
        System.out.println();

        List<Integer> integers = Arrays.asList(10, 5, 6, -2, -12, 145);
        List<Integer> integerList = integers.stream()
                                                .filter(num -> num > 0)
                                                .collect(Collectors.toList());
        System.out.println("Задание на потоки №0:");
        integerList.forEach(System.out::println);
        System.out.println();

        List<Task> taskArrayList = List.of(
                new Task("Bug #1", 10),
                new Task("Task #2", 20),
                new Task("Bug #3", 50)
        );
        System.out.println("Задание на потоки №0.1:");
        taskArrayList.stream()
                        .filter(task -> task.name.contains("Bug"))
                        .filter(task -> task.spent > 30)
                        .map(task -> task.name + " " + task.spent)
                        .forEach(System.out::println);
        System.out.println();
    }
}

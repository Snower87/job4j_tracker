package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Class JobSorter сортировка структуры данных Job 1) практира работы с сортировкой на примере класса Job (#95)
 * 2) практика работы с комбинированными компараторами (#97)
 * @author Sergei Begletsov
 * @since 15.08.2021
 * @version 2
 */

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println("Сортировка коллекции по приоритету:");
        System.out.println("Before sort: " + jobs);
        Collections.sort(jobs);
        System.out.println("After sort: " + jobs);
        System.out.println();

        System.out.println("Сортировка коллекции по имени:");
        Collections.sort(jobs, new SortJobByName());
        System.out.println(jobs);

        List<Job> jobs2compare = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Fix bugs", 0),
                new Job("Fix bugs", 1),
                new Job("Impl task", 2)
        );
        System.out.println();
        System.out.println("jobs2compare (до сортировки):" + jobs2compare);
        System.out.println("Сортировка по 2м компараторам:");
        System.out.println("В начале сортировка по-имени -> потом по приоритету, все поля <<по убыванию>>");
        Collections.sort(jobs2compare, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs2compare);
        System.out.println();

        System.out.println("В начале сортировка по приоритету -> потом по-имени, все поля <<по убыванию>>");
        Collections.sort(jobs2compare, new JobDescByPriority().thenComparing(new JobDescByName()));
        System.out.println(jobs2compare);
        System.out.println();
    }
}

package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Class JobSorter сортировка структуры данных Job 1) практира работы с сортировкой на примере класса Job (#95)
 * @author Sergei Begletsov
 * @since 15.08.2021
 * @version 1
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
    }
}

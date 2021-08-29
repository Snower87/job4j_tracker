package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Class JobSorterVer2 практика работы с функциями высшего порядка (зависят от других функции)
 * 1) создание класса (#112)
 * @author Sergei Begletsov
 * @since 29.08.2021
 * @version 1
 */

public class JobSorterVer2 {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("AAAAA", 9),
                new Job("DDDDD", 1),
                new Job("CCCCC", 4),
                new Job("AAAAA", 4),
                new Job("BBBBB", 2),
                new Job("AAAAA", 2),
                new Job("BBBBB", 0),
                new Job("BBBBB", 3)
        );
        jobs.sort(new JobAscByName().thenComparing(new JobAscByPriority()));
        System.out.println("Сортировка через объект класса компаратора:");
        System.out.println("<< По возрастанию имени >>");
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println("Сортировка через объект класса компаратора:");
        System.out.println("<< По убыванию имени >>");
        System.out.println(jobs);
        System.out.println();

        Comparator<Job> compareName = Comparator.comparing(Job::getName);
        Comparator<Job> comparePriority = Comparator.comparing(Job::getPriority);
        Comparator<Job> combine = comparePriority.thenComparing(compareName);
        jobs.sort(combine);
        System.out.println("Сортировка через ссылки на методы компаратора:");
        System.out.println(jobs);
        System.out.println();
    }
}

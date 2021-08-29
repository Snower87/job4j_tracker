package ru.job4j.lambda;

import ru.job4j.collection.*;

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
        System.out.println("<< По возрастанию имени, затем по возрастанию приоритета (если итемы равны) >>");
        System.out.println("<< если итемы не равны, то сортировка по 2му компаратору thenComparing не происходит >>");
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new JobAscByName().thenComparing(new JobDescByPriority()));
        System.out.println("Сортировка через объект класса компаратора:");
        System.out.println("<< По возрастанию имени ver.2, затем по убыванию приоритета (если итемы равны) >>");
        System.out.println("<< если итемы не равны, то сортировка по 2му компаратору thenComparing не происходит >>");
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new JobDescByName().thenComparing(new JobAscByPriority()));
        System.out.println("Сортировка через объект класса компаратора:");
        System.out.println("<< По убыванию имени, затем по возрастанию приоритета (если итемы равны) >>");
        System.out.println("<< если итемы не равны, то сортировка по 2му компаратору thenComparing не происходит >>");
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new JobDescByName());
        System.out.println("Сортировка через объект класса компаратора:");
        System.out.println("<< По убыванию имени, ver.2 >>");
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

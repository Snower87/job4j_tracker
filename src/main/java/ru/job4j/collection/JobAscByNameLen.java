package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class JobAscByNameLen - компаратор для сортировки по длине поля (name) для класса-данных Job <<increase>>
 * (по возрастанию) 1) практира работы с компараторами для класса Job (#97)
 * @author Sergei Begletsov
 * @since 17.08.2021
 * @version 1
 */

public class JobAscByNameLen implements Comparator<Job> {
    @Override
    public int compare(Job job1, Job job2) {
        return Integer.compare(job1.getName().length(), job2.getName().length());
    }
}

package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class JobDescByName - компаратор для сортировки по полю (name) для класса-данных Job <<decrease>> (по убыванию)
 * 1) практира работы с компараторами для класса Job (#97)
 * @author Sergei Begletsov
 * @since 17.08.2021
 * @version 1
 */

public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job job1, Job job2) {
        return job2.getName().compareTo(job1.getName());
    }
}

package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class JobDescByPriority - компаратор для сортировки по полю (priority) для класса-данных Job <<decrease>> (по убыванию)
 * 1) практира работы с компараторами для класса Job (#97)
 * @author Sergei Begletsov
 * @since 17.08.2021
 * @version 1
 */

public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job job1, Job job2) {
        return Integer.compare(job2.getPriority(), job1.getPriority());
    }
}

package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class SortJobByName сортировка структуры Job по полю name 1) реализация сортировки (#95)
 * @author Sergei Begletsov
 * @since 15.08.2021
 * @version 1
 */

public class SortJobByName implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}

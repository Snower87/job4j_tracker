package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Класс SearchFolder реализует сервис работы с папками 1) создание класса, практика работы с функц. интерфейсами (#105)
 * @author Sergei Begletsov
 * @since 23.08.2021
 * @version 1
 */

public class SearchFolder {
    /**
     * Фильтрация папок по заданным условиям
     * @param list список папок
     * @param pred условие добавления папок (ФИ Predicate)
     * @return список папод, прошедших фильтрацию
     */
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder f: list) {
            if (pred.test(f)) {
                rsl.add(f);
            }
        }
        return rsl;
    }
}

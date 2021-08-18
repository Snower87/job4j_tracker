package ru.job4j.collection;

import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * Класс LexSort реализует сравнение строк по начальному номеру 1) реализация компаратора по первоначальному числу (#100)
 * @author Sergei Begletsov
 * @since 18.08.2021
 * @version 1
 */

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        //1. Подключаю StringTokenizer для парсинга строки на первоначальный номер
        StringTokenizer strLeft = new StringTokenizer(left, " .");
        StringTokenizer strRight = new StringTokenizer(right, " .");

        //2. Парсю строки на числовое значение номера задачи
        Integer indLeft = 0;
        Integer indRight = 0;

        while (strLeft.hasMoreTokens()) {
            indLeft = Integer.valueOf(strLeft.nextToken(), 10);
            break;
        }

        while (strRight.hasMoreTokens()) {
            indRight = Integer.valueOf(strRight.nextToken(), 10);
            break;
        }

        //3. Сравниваю полученные числовые значения номеров задач
        return indLeft.compareTo(indRight);
    }
}

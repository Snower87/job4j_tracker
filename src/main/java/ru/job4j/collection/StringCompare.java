package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class StringCompare компаратор строк 1) реализация своего компаратора строк (#98) 2) 2ой вариант реализации
 * компаратора, добавил доп. тесты (#99)
 * @author Sergei Begletsov
 * @since 18.08.2021
 * @version 2
 */

public class StringCompare implements Comparator<String> {
    @Override
    /**
     * Сравнивает две строки
     * @param left строка1 для сравнения
     * @param right строка2 для сравнения
     * @return 0 когда строки равны,
     *         > 0 когда строка left длиннее, а right короче,
     *         < 0 когда строка left короче, а right длиннее.
     */
    public int compare(String left, String right) {
        int rsl = 0;

        //1. Проходимся по минимальной длине строк
        for (int index = 0; index < Math.min(left.length(), right.length()); index++) {
            //2. Сравниваем символы 2х строк
            rsl = Character.compare(left.charAt(index), right.charAt(index));
            if (rsl != 0) {
                //2.1 Символы сравниваемых строк отличаются -> выходим
                break;
            }
        }

        //2.2 Слова/строки одинаковы по минимальной длине -> проверяем дальше

        //3. Формируем результат:
        //3.1 Если строки    равны (rsl == 0) по минимальной длине, то сравниваем их по своей собственной длине,
        //3.2 Если строки не равны (rsl != 0) по минимальной длине, то возвращаем данный результат сравнения.
        return rsl == 0 ? Integer.compare(left.length(), right.length()) : rsl;
    }
}

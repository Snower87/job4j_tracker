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

        for (int index = 0; index < Math.min(left.length(), right.length()); index++) {
            rsl = Character.compare(left.charAt(index), right.charAt(index));
            if (rsl != 0) {
                break;
            }
        }

        return rsl == 0 ? Integer.compare(left.length(), right.length()) : rsl;
    }
}

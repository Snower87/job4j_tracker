package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class StringCompare компаратор строк 1) реализация своего компаратора строк (#98)
 * @author Sergei Begletsov
 * @since 18.08.2021
 * @version 1
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
        int lenLeft  = left.length();
        int lenRight = right.length();

        int index = 0;

        //Алгоритм компаратора строк:
        //1. Сравнение строк при одинаковой длине
        //
        while (index < lenLeft && index < lenRight) {

            if (left.charAt(index) != right.charAt(index)) {
                return Character.compare(left.charAt(index), right.charAt(index));
            }

            index++;
        }

        //2. Сравнение строк, когда слово left > больше по длине слова right
        //   Возвращаем ++ положительное число
        while (index < lenLeft) {
            return left.charAt(index);
        }

        //3. Сравнение строк, когда слово right > больше по длине слова left
        //   Возвращаем -- отрицательное число
        while (index < lenRight) {
            return -right.charAt(index);
        }

        //4. Сравниваемые строки равны
        //   Возвращаем 00
        return 0;
    }
}

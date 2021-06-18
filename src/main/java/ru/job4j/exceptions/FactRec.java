package ru.job4j.exceptions;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0.6. Error - исключения, связанные с работой виртуальной машины. [219370#271526]
 * @Описание 1. Запустите код вычисления факториала через рекурсию.
 * 2. Найдите и поравьте код.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 18.06.2021
 * @version 1
 */

public class FactRec {
    public static int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return calc(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}

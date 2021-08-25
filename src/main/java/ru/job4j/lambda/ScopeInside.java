package ru.job4j.lambda;

import java.util.function.Supplier;

/**
 * Class ScopeInside практика работы с зоной видимости в ля-выражениях 1) создание класса (#110)
 * @author Sergei Begletsov
 * @since 25.08.2021
 * @version 1
 */

public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            total += add(
                    () -> num
            );
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}

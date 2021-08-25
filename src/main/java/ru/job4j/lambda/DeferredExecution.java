package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Class DeferredExecution практика работы с ленивой загрузкой 1) создание класса (#108)
 * @author Sergei Begletsov
 * @since 25.08.2021
 * @version 1
 */

public class DeferredExecution {
    public static void main(String[] args) {
        //1. Если из массива names убрать второе зн-е, то сортировка не будет выполняться
        //   и не выбедется диагностическая информация на консоль - это называется ленивая загрузка.
        //2. Это свойство увеличивает скорость программы. Практическое применение этого свойства будет
        //   в разделе Stream API.
        String[] names = {
                "Petr",
                "Ivan"
        };
        Comparator<String> compLength = (str1, str2) -> {
            System.out.println("compare: " + str1 + ", " + str2);
            return str1.length() - str2.length();
        };
        Arrays.sort(names, compLength);
    }
}

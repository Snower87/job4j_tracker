package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Class LambdaUsage практика работы с лямбда блоками 1) создание класса (#107)
 * @author Sergei Begletsov
 * @since 24.08.2021
 * @version 1
 */

public class LambdaUsage {
    /**
     * Вывод полученного результата после сортировки
     * @param string
     * @param objects
     * @param comparator
     */
    public static void show(String string, Object[] objects, Comparator comparator) {
        System.out.println();
        Arrays.sort(objects, comparator);
        System.out.println(string);
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    /**
     * Сортировка массива строк по возрастанию номера задачи
     */
    public static void sortArraysByNumberAtSrtring() {
        String[] numbers = {
                "101. Task",
                "20. Task",
                "9. Task"
        };

        Comparator<String> compString = (left, right) -> {
            int first = Integer.valueOf(left.substring(0, left.indexOf(".")));
            int second = Integer.valueOf(right.substring(0, right.indexOf(".")));
            return first - second;
        };
        show("Сортировка по номеру N в строке:", numbers, compString);
    }

    /**
     * Сортировка массива объектов Attachment по возрастанию поля 'size'
     */
    public static void sortArraysByLambdaBlockByIncSize() {
        Attachment[] attachments = {
                new Attachment("afix", 333),
                new Attachment("zzzfix", 111),
                new Attachment("bbfix", 222),
        };

        Comparator<Attachment> compIncSize = (left, right) -> {
            System.out.println("compare size " + left.getSize() + " : " + right.getSize());
            return left.getSize() - right.getSize();
        };
        show("Сортировка по полю Size :", attachments, compIncSize);
    }

    /**
     * Сортировка текста по убыванию
     */
    public static void sortArraysByLambdaBlockCompTextDec() {
        String[] text = {
                "afix",
                "zzzfix",
                "bbfix",
                "aaaaaaaaaaa",
                "a",
                "abc"
        };
        Comparator<String> cmpTextDec = (left, right) -> {
            System.out.println("compare text " + left + " : " + right);
            return right.compareTo(left);
        };
        show("Сортировка по тексту по убыванию:", text, cmpTextDec);
    }

    public static void main(String[] args) {
        LambdaUsage.sortArraysByNumberAtSrtring();

        LambdaUsage.sortArraysByLambdaBlockByIncSize();

        LambdaUsage.sortArraysByLambdaBlockCompTextDec();
    }
}

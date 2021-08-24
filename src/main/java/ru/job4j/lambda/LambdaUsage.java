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
        //1. Список строк под сортировку по номеру N в строке
        String[] numbers = {
                "101. Task",
                "20. Task",
                "9. Task"
        };

        //2. Компаратор на базе лямбда-блока,
        //   вывод на консоль результата сортировки
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
        //1. Список Attachment под сортировку
        Attachment[] attachments = {
                new Attachment("afix", 333),
                new Attachment("zzzfix", 111),
                new Attachment("bbfix", 222),
        };

        //2. Сортировка с использованием лямбды-блока по полю Size,
        //   вывод на консоль результата сортировки
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
        //1. Список Attachment под сортировку по убыванию
        String[] text = {
                "afix",
                "zzzfix",
                "bbfix",
                "aaaaaaaaaaa",
                "a",
                "abc"
        };
        //2. Сортировка с использованием лямбды-блока по тексту,
        //   вывод на консоль результата сортировки
        Comparator<String> cmpTextDec = (left, right) -> {
            System.out.println("compare text " + left + " : " + right);
            return right.compareTo(left);
        };
        show("Сортировка по тексту по убыванию:", text, cmpTextDec);
    }

    public static void main(String[] args) {
        //1. Сортировка через лямбда-блок
        //   по номеру N, записанному в строке
        LambdaUsage.sortArraysByNumberAtSrtring();

        //2. Сортировка через лямбда-блок
        //   по возрастанию поля Size
        LambdaUsage.sortArraysByLambdaBlockByIncSize();

        //3. Сортировка через лямбда-блок
        //   по убыванию текста
        LambdaUsage.sortArraysByLambdaBlockCompTextDec();
    }
}

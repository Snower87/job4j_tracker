package ru.job4j.function;

import java.util.*;
import java.util.function.*;

/**
 * Class FunctionInterfaceUsage практира работы с функциональными интерфейсами 1) создание класса (#103)
 * @author Sergei Begletsov
 * @since 22.08.2021
 * @version 1
 */

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        //1. Замените вставку элементов в карту на использование BiConsumer, он уже объявлен, требуется его реализовать.
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (i, s) -> map.put(i, s);
        //map.put(1, "one"); //было
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");
        System.out.println(map);
        System.out.println();

        //2. Замените проверку в if() на использование BiPredicate, он объявлен выше, требуется его реализовать
        BiPredicate<Integer, String> biPred = (i, s) -> i % 2 == 0 || map.get(i).length() == 4;
        for (Integer i : map.keySet()) {
            //if (i % 2 == 0 || map.get(i).length() == 4) { //было
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        System.out.println();

        //3. Заменить создание ArrayList из значений Map на Supplier, объявлен ниже, требуется его реализовать.
        Supplier<List<String>> sup = () -> new ArrayList<String>(map.values());
        //List<String> strings = new ArrayList<>(map.values()); //было
        List<String> strings = sup.get();
        for (String str: strings) {
            System.out.println(str);
        }
        System.out.println();

        //4. Заменить вывод строк на применение Consumer,
        //   Заменить преобразование строк к строкам в верхнем регистре с помощью Function
        //   Необходимое объявлено выше, требуется их реализовать.
        Consumer<String> con = (s) -> System.out.println(s);
        Function<String, String> func = (s1) -> s1.toUpperCase();
        for (String s : strings) {
            //System.out.println(s.toUpperCase()); //было
            con.accept(func.apply(s));
        }
    }
}

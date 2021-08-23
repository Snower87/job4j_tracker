package ru.job4j.function;

import java.util.*;
import java.util.function.*;

/**
 * Class FunctionInterfaceUsage практира работы с функциональными интерфейсами 1) создание класса (#103)
 * 2) устранение ошибок (#104)
 * @author Sergei Begletsov
 * @since 22.08.2021
 * @version 2
 */

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (i, s) -> map.put(i, s);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");
        System.out.println(map);
        System.out.println();

        BiPredicate<Integer, String> biPred = (i, s) -> i % 2 == 0 || s.length() == 4;
        for (Integer i : map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        System.out.println();

        Supplier<List<String>> sup = () -> new ArrayList<String>(map.values());
        List<String> strings = sup.get();
        System.out.println();

        Consumer<String> con = s -> System.out.println(s);
        Function<String, String> func = s -> s.toUpperCase();
        for (String s : strings) {
            con.accept(func.apply(s));
        }
    }
}

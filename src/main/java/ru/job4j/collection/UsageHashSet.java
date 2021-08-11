package ru.job4j.collection;

import java.util.HashSet;

/**
 * Class UsageHashSet - 1) практика работы с коллекцией HashSet (#85)
 * @author Sergei Begletsov
 * @since 11.08.2021
 * @version 1
 */

public class UsageHashSet {
    public void addNames() {
        //Особенность коллекций java.util.Set является сохранение только уникальных элементов,
        //не добавляют дублирующие элементы.
        HashSet<String> names = new HashSet<>();

        names.add("Petr");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Sergei");

        //Вывод на консоль через for и String
        System.out.println();
        System.out.println("Вывод на консоль через for и String");
        for (String name: names) {
            System.out.println(name);
        }

        //Вывод на консоль через объект Object
        System.out.println();
        System.out.println("Вывод на консоль через объект Object");
        for (Object obj: names) {
            System.out.println(obj);
        }
    }

    public void addAuto() {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");

        for (String auto: autos) {
            System.out.println(auto);
        }
    }

    public static void main(String[] args) {
        //UsageHashSet name = new UsageHashSet();
        //name.addNames();

        UsageHashSet auto = new UsageHashSet();
        auto.addAuto();
    }
}

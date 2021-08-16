package ru.job4j.collection;

import java.util.Objects;

/**
 * Class User класс-данных с полями: имя + возраст 1) реализация + переопределение метода compareTo() для сортировки (#96)
 * @author Sergei Begletsov
 * @since 16.08.2021
 * @version 1
 */

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User another) {
        //1. Сравниваю имена 2х пользователей
        int result = this.name.compareTo(another.name);

        //2. Имена пользователей равны?
        if (result == 0) {
            //2.1 Да, -> сравниваем возраст пользователей
            //Вариант №1. Сравнение через класс Age
            result = Integer.compare(this.age, another.age);
            //Вариант №2. Сравнение через разницу возрастов
            //return this.age - another.age;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

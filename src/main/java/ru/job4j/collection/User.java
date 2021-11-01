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
        int result = this.name.compareTo(another.name);

        if (result == 0) {
            result = Integer.compare(this.age, another.age);
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

package ru.job4j.map;

import java.util.Objects;

/**
 * Класс Student описывает студента, в нем определены 3 поля: имя студента, аккаунт (уникальный идентификатор), группа.
 * 1) создание класса (#124)
 * @author Sergei Begletsov
 * @since 07.09.2021
 * @version 1
 */

public class Student {
    private String name;
    private String account;
    private String group;

    public Student(String name, String account, String group) {
        this.name = name;
        this.account = account;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(account, student.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}

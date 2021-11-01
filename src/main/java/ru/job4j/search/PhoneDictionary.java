package ru.job4j.search;

import java.util.ArrayList;

/**
 * @Раздел Блок 3. Collections. Lite / 1. Коллекция List, ArrayList
 * @Задание 1. Телефонный справочник на базе ArrayList. [#41598 #23672]
 * @Описание 1. Создайте класс ru.job4j.collection.UsageArrayList. В нем создайте метод main.
 * 2. В методе main создайте объект ArrayList с типом String. Добавьте в него 3 имени: Petr, Ivan, Stepan.
 * Далее через цикл for-each выведите все элементы на консоль.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 08.08.2021
 * @version 1
 */

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person: this.persons) {
            if (person.getName().contains(key) || person.getSurname().contains(key) ||
                    person.getPhone().contains(key) || person.getAddress().contains(key)) {
                result.add(person);
                continue;
            }
        }

        if (result.size() == 0) {
            System.out.println("String or substring in the PhoneDictionary not found");
        }

        return result;
    }
}

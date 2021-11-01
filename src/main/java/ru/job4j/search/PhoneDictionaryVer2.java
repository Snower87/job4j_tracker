package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Class PhoneDictionaryVer2 практика работы с функциями высшего порядка (зависят от других функций)
 * 1) создание класса (#112) 2) рефакторинг через ФИ, создание объединяющего 5-го Predicate (#113)
 * 3) рефакторинг, перевод пар-ов на тип var (#136)
 * @author Sergei Begletsov
 * @since 29.08.2021
 * @version 3
 */

public class PhoneDictionaryVer2 {
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
        Predicate<Person> combine = (name) -> {
            var rsl = false;
            Predicate<Person> compName    = (person) -> person.getName().contains(key);
            Predicate<Person> compSurName = (person) -> person.getSurname().contains(key);
            Predicate<Person> compPhone   = (person) -> person.getPhone().contains(key);
            Predicate<Person> compAddress = (person) -> person.getAddress().contains(key);
            Predicate<Person> compParam   = compName.or(compSurName).or(compPhone).or(compAddress);

            if (compParam.test(name)) {
                rsl = true;
            }
            return rsl;
        };

        for (var person: persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }

        if (result.size() == 0) {
            System.out.println("String or substring in the PhoneDictionary not found");
        }

        return result;
    }
}

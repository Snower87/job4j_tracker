package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Class PhoneDictionaryVer2 практика работы с функциями высшего порядка (зависят от других функций)
 * 1) создание класса (#112) 2) рефакторинг через ФИ, создание объединяющего 5-го Predicate (#113)
 * @author Sergei Begletsov
 * @since 29.08.2021
 * @version 2
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
        //1. Использование функционального интерфейса Predicate в качестве фильтра
        Predicate<Person> combine = (name) -> {
            boolean rsl = false;
            //1.1 Использование интерфейса Predicate в качестве подфильтров
            Predicate<Person> compName    = (person) -> person.getName().contains(key);
            Predicate<Person> compSurName = (person) -> person.getSurname().contains(key);
            Predicate<Person> compPhone   = (person) -> person.getPhone().contains(key);
            Predicate<Person> compAddress = (person) -> person.getAddress().contains(key);
            Predicate<Person> compParam   = compName.or(compSurName).or(compPhone).or(compAddress);

            //было:
            //1 вариант (старый)
            /*
            if (name.getName().contains(key) || name.getSurname().contains(key) ||
                    name.getPhone().contains(key) || name.getAddress().contains(key)) {
                rsl = true;
            };
            */
            //стало:
            //2 вариант (новый)
            if (compParam.test(name)) {
                rsl = true;
            }
            return rsl;
        };

        for (Person person: persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }

        //если строку не нашли - вывожу сообщение
        if (result.size() == 0) {
            System.out.println("String or substring in the PhoneDictionary not found");
        }

        return result;
    }
}

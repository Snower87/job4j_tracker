package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PhoneDictionaryVer2Test {
    @Test
    public void whenFindByName() {
        PhoneDictionaryVer2 phones = new PhoneDictionaryVer2();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindStr123() {
        PhoneDictionaryVer2 phones = new PhoneDictionaryVer2();
        phones.add(
                new Person("Vasiliy123", "Nezvaikin", "123", "Saint-Peterburg")
        );
        phones.add(
                new Person("Petr", "Arsentev", "5341872", "Bryansk")
        );
        phones.add(
                new Person("Kirill", "Netrusov", "444333", "Vitebsk13")
        );
        phones.add(
                new Person("Maxim", "Besbiletov", "123123", "Saint-Peterburg")
        );
        ArrayList<Person> persons = phones.find("123");
        assertThat(persons.get(0).getName(), is("Vasiliy123"));
        assertThat(persons.get(1).getName(), is("Maxim"));
    }
}
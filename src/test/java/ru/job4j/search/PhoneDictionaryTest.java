package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindStr123() {
        PhoneDictionary phones = new PhoneDictionary();
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
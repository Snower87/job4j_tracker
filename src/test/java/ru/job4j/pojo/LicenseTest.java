package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LicenseTest {
    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void eqAllFieldClass() {
        License first = new License();
        first.setCode("xx123z");
        first.setModel("Lada Calina");
        first.setOwner("Petya Svetlakov");
        License second = new License();
        second.setCode("xx123z");
        second.setModel("Lada Calina");
        second.setOwner("Petya Svetlakov");
        assertThat(first, is(second));
    }

    @Test
    public void notEqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio2");
        assertNotEquals(first, second);
    }

    @Test
    public void notEqOwner() {
        License first = new License();
        first.setCode("xx123z");
        first.setModel("Lada Calina");
        first.setOwner("Petya Belov");
        License second = new License();
        second.setCode("xx123z");
        second.setModel("Lada Calina");
        second.setOwner("Petya Svetlakov");
        assertNotEquals(first, second);
    }

    @Test
    public void notEqCode() {
        License first = new License();
        first.setCode("ee123z");
        first.setModel("Lada Calina");
        first.setOwner("Petya Svetlakov");
        License second = new License();
        second.setCode("xx123z");
        second.setModel("Lada Calina");
        second.setOwner("Petya Svetlakov");
        assertNotEquals(first, second);
    }

    @Test
    public void notEqModel() {
        License first = new License();
        first.setCode("xx123z");
        first.setModel("Lada Vesta");
        first.setOwner("Petya Svetlakov");
        License second = new License();
        second.setCode("xx123z");
        second.setModel("Lada Calina");
        second.setOwner("Petya Svetlakov");
        assertNotEquals(first, second);
    }
}
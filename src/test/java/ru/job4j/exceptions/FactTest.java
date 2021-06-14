package ru.job4j.exceptions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenFactMinus1ThenFinish() {
        new Fact().calc(-1);
    }

    @Test
    public void whenNumber3ThenFact6() {
        int rsl = new Fact().calc(3);
        assertThat(rsl, is(6));
    }
}
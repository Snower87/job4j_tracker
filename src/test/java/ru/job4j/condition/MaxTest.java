package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class MaxTest {
    @Test
    public void whenMax2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax10() {
        int result = Max.max(8, 2, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax4() {
        int result = Max.max(1, 4, 3, 2);
        assertThat(result, is(4));
    }
}
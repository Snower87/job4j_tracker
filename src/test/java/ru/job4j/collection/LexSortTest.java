package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };

        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum1and2and110() {
        String[] input = {
                "10. Task10.",
                "1. Task1.",
                "12. Task12.",
                "110. Task2.",
                "2. Task2.",
                "4. Task4.",
                "35. Task35.",
                "22. Task22.",
                "47. Task47.",
                "3. Task3.",
                "61. Task61.",
                "99. Task99.",
                "74. Task74.",
                "86. Task86."
        };
        String[] out = {
                "1. Task1.",
                "2. Task2.",
                "3. Task3.",
                "4. Task4.",
                "10. Task10.",
                "12. Task12.",
                "22. Task22.",
                "35. Task35.",
                "47. Task47.",
                "61. Task61.",
                "74. Task74.",
                "86. Task86.",
                "99. Task99.",
                "110. Task2."
        };

        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum0and55and12() {
        String[] input = {
                "0. Task.",
                "55. Task.",
                "12. Task."
        };
        String[] out = {
                "0. Task.",
                "12. Task.",
                "55. Task."
        };

        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}
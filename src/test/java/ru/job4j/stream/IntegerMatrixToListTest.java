package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IntegerMatrixToListTest {
    @Test
    public void whenIntegerListOf8Numbers() {
        Integer[][] intMatrix = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };

        List<Integer> expectedList = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8
        );

        assertEquals(expectedList, IntegerMatrixToList.convert(intMatrix));
    }

    @Test
    public void whenIntegerListOf9Numbers() {
        Integer[][] intMatrix = {
                {1, 2, 3},
                {4, 5},
                {6},
                {7, 8, 9},
                {}
        };

        List<Integer> expectedList = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );

        assertEquals(expectedList, IntegerMatrixToList.convert(intMatrix));
    }

    @Test
    public void whenIntegerListOf6Numbers() {
        Integer[][] intMatrix = {
                {1, 2, 3},
                {-4, 5},
                {},
                {0}
        };

        List<Integer> expectedList = Arrays.asList(
                1, 2, 3, -4, 5, 0
        );

        assertEquals(expectedList, IntegerMatrixToList.convert(intMatrix));
    }
}
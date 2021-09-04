package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IntegerMatrixToListTest {
    @Test
    public void whenIntegerListOf8Numbers() {
        //1. Входное значение
        Integer[][] intMatrix = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };

        //2. Ожидаемое значение
        List<Integer> expectedList = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8
        );

        //3. Выдать предупреждение, если не равны
        assertEquals(expectedList, IntegerMatrixToList.convert(intMatrix));
    }

    @Test
    public void whenIntegerListOf9Numbers() {
        //1. Входное значение
        Integer[][] intMatrix = {
                {1, 2, 3},
                {4, 5},
                {6},
                {7, 8, 9},
                {}
        };

        //2. Ожидаемое значение
        List<Integer> expectedList = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );

        //3. Выдать предупреждение, если не равны
        assertEquals(expectedList, IntegerMatrixToList.convert(intMatrix));
    }

    @Test
    public void whenIntegerListOf6Numbers() {
        //1. Входное значение
        Integer[][] intMatrix = {
                {1, 2, 3},
                {-4, 5},
                {},
                {0}
        };

        //2. Ожидаемое значение
        List<Integer> expectedList = Arrays.asList(
                1, 2, 3, -4, 5, 0
        );

        //3. Выдать предупреждение, если не равны
        assertEquals(expectedList, IntegerMatrixToList.convert(intMatrix));
    }
}
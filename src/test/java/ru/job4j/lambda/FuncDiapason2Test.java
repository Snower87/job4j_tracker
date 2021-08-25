package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FuncDiapason2Test {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FuncDiapason2.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = FuncDiapason2.diapason(0, 4, x -> x * x + 3);
        List<Double> expected = Arrays.asList(3D, 4D, 7D, 12D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExpFunctionThenExpResults() {
        List<Double> result = FuncDiapason2.diapason(0, 3, x -> Math.pow(10, x) + 1);
        List<Double> expected = Arrays.asList(2D, 11D, 101D);
        assertThat(result, is(expected));
    }
}
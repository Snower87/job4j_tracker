package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        List<Integer> expect = List.of(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }

    @Test
    public void whenThreeList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {10, 11, 12});
        in.add(new int[] {13, 14});
        in.add(new int[] {});
        in.add(new int[] {15, 16, 17});
        List<Integer> expect = List.of(10, 11, 12, 13, 14, 15, 16, 17);
        assertThat(ConvertList.convert(in), is(expect));
    }
}
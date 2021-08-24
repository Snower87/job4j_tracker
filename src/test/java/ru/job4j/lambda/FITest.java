package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FITest {
    @Test
    public void testSortAscByText() {
        List<String> list = Arrays.asList("aaa", "zzz", "bbb", "xxx", "yyy", "ccc");
        List<String> expected = List.of(
                "aaa", "bbb", "ccc", "xxx", "yyy", "zzz"
        );
        new FI().sortAscByText(list);
        assertThat(list, is(expected));
    }

    @Test
    public void testSortDescByText() {
        List<String> list = Arrays.asList("aaa", "zzz", "bbb", "xxx", "yyy", "ccc");
        List<String> expected = List.of(
                "zzz", "yyy", "xxx", "ccc", "bbb", "aaa"
                );
        new FI().sortDescByText(list);
        assertThat(list, is(expected));
    }

    @Test
    public void testSortAscByAttachments() {
        List<Attachment> list = Arrays.asList(
                new Attachment("aaa", 30),
                new Attachment("zzz", 20),
                new Attachment("bbb", 50),
                new Attachment("xxx", 40),
                new Attachment("yyy", 90),
                new Attachment("ccc", 60)
        );
        Comparator<Attachment> compAscByText = (left, right) -> left.getName().compareTo(right.getName());
        List<Attachment> expected = List.of(
                new Attachment("aaa", 30),
                new Attachment("bbb", 50),
                new Attachment("ccc", 60),
                new Attachment("xxx", 40),
                new Attachment("yyy", 90),
                new Attachment("zzz", 20)
        );
        new FI().sortByTextWithComparator(list, compAscByText);
        assertThat(list, is(expected));
    }

    @Test
    public void testSortDescByAttachments() {
        List<Attachment> list = Arrays.asList(
                new Attachment("aaa", 30),
                new Attachment("zzz", 20),
                new Attachment("bbb", 50),
                new Attachment("xxx", 40),
                new Attachment("yyy", 90),
                new Attachment("ccc", 60)
        );
        Comparator<Attachment> compDescByText = (left, right) -> right.getName().compareTo(left.getName());
        List<Attachment> expected = List.of(
                new Attachment("zzz", 20),
                new Attachment("yyy", 90),
                new Attachment("xxx", 40),
                new Attachment("ccc", 60),
                new Attachment("bbb", 50),
                new Attachment("aaa", 30)
        );
        new FI().sortByTextWithComparator(list, compDescByText);
        assertThat(list, is(expected));
    }
}
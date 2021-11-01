package ru.job4j.search;

import org.junit.Test;

import java.util.LinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        var result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenEqualsPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("first", 5));
        queue.put(new Task("second", 5));
        queue.put(new Task("third", 5));
        var result = queue.take();
        assertThat(result.getDesc(), is("first"));
    }
}
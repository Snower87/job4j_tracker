package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleTrackerTest {
    @Test
    public void whenTwoObjectLinkedWithOnObjectSingleton() {
        SingleTracker singleTracker1 = SingleTracker.getTracker();
        SingleTracker singleTracker2 = SingleTracker.getTracker();
        assertEquals(singleTracker1, singleTracker2);
    }

    @Test
    public void whenAdd2StringAtTwoDiffObjectSingleton() {
        SingleTracker singleTracker1 = SingleTracker.getTracker();
        SingleTracker singleTracker2 = SingleTracker.getTracker();
        Item[] expected = new Item[] {
                new Item(1, "nike"),
                new Item(2, "adidas"),
                new Item(3, "dior")
        };
        singleTracker1.add(expected[0]);
        singleTracker2.add(expected[1]);
        singleTracker2.add(expected[2]);
        assertArrayEquals(expected, singleTracker1.findAll());
        assertArrayEquals(expected, singleTracker2.findAll());
    }
}
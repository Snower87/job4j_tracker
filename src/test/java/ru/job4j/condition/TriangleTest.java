package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenExist() {
        Triangle in = new Triangle(new Point(0, 0), new Point(1, 1), new Point(0, 2));
        double expected = 1;
        double out = in.area();
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenNotExist() {
        Triangle in = new Triangle(new Point(0, 0), new Point(0, 0), new Point(0, 2));
        double expected = -1;
        double out = in.area();
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenExist2() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        Assert.assertEquals(8, rsl, 0.001);
    }
}
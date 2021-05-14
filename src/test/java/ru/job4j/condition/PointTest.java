package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void whenPoint0020Coordx1y1x2y2ThenDistance2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPoint0022Coordx1y1x2y2ThenDistance2dot8284271247461903() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        double expected = 2.8284271247461903;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPointMin2Min2Plus2Plus2Coordx1y1x2y2ThenDistance5dot656854249492381() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.656854249492381;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3DCoord1ThenDistance2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 0);
        double expected = 2;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3DCoord2ThenDistance2dot8284271247461903() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 0);
        double expected = 2.8284271247461903;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
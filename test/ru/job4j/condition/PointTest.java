package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when01To22Then2Dot23() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double expected = 2.23;
        double out = Point.distance(x1, y1, x2, y2);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void when53To36Then3Dot6() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 3;
        int y2 = 6;
        double expected = 3.6;
        double out = Point.distance(x1, y1, x2, y2);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void when00To22Then2Dot82() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }
}
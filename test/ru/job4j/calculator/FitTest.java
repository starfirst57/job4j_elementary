package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manHeigth180Then92() {
       short in = 180;
       double expected = 92;
       double out = Fit.manWeigth(in);
       double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void womanHeigth165Then63Dot25() {
        short in = 165;
        double expected = 63.25;
        double out = Fit.womanWeigth(in);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }
}
package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3El() {
        int[] data = new int[] {9, 5, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 5, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5el() {
        int[] data = new int[] {6, 11, 2, 4, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 6, 8, 11};
        Assert.assertArrayEquals(expected, result);
    }
}
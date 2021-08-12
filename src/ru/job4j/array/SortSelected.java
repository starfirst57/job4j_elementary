package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int tmp = 0;
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            tmp = data[i];
            data[i] = data[index];
            data[index] = tmp;
        }
        return data;
    }
}

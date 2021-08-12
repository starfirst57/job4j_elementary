package ru.job4j.array;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != null && j > point) {
                        SwitchArray.swap(array, j, index);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}

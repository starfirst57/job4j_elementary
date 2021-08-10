package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
            return prime;
        }
        for (int i = 2; i < number - 1; i++) {
            prime = number % i != 0 || i == number;
            break;
        }
        return prime;
    }
}

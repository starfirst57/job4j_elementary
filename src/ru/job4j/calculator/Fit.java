package ru.job4j.calculator;

public class Fit {
    public static double manWeigth(short height){
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static double womanWeigth(short heigth){
        double rsl = (heigth - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heigth = 187;
        double man = Fit.manWeigth(heigth);
        System.out.println("Man 187 is " + man);
    }
}

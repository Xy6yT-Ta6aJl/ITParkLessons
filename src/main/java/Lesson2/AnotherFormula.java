package Lesson2;

import static java.lang.Math.pow;

// Формула Эквивалентности массы и энергии E = mc²

public class AnotherFormula {
    public static final long C = 299_792_458;

    public static void main(String[] args) {


        double e = greatFormula(92, C);
        System.out.println(e);


    }

    public static double greatFormula(double m, double c) {
        return m * pow(c, 2);
    }
}

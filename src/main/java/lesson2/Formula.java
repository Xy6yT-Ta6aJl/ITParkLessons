package lesson2;

import static java.lang.Math.pow;

    // Квадрат разности  (a - b)² = a² - 2ab + b²

public class Formula {
    public static void main(String[] args) {

        double result = squaredOfDifference(35, 6);
        System.out.println(result);


    }

    public static double squaredOfDifference(double a, double b) {

        return pow((a - b), 2);
    }
}


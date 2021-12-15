package lesson6;

import java.util.Scanner;

public class MyArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int size = scanner.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();

        }

        double min = getMin(array);
        System.out.println("Минимальное значение в массиве равно " + min);
        double max = getMax(array);
        System.out.println("Максимальное значение в массиве равно " + max);
        double res = getAvg(size, array);
        System.out.println("Среднее арифметическое значение равно " + res);
    }

    private static double getMax(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    private static double getAvg(int size, double[] array) {

        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        double res = sum / size;
        return res;
    }

    private static double getMin(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}

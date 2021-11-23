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

        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Минимальное значение в массиве равно " + min);

        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Максимальное значение в массиве равно " + max);


        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        double res = sum / size;
        System.out.println("Среднее арифметическое значение равно " + res);
    }
}

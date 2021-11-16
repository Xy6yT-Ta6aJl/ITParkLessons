package lesson4;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое, положительное число.");
        int value = console.nextInt();
        if (value <= 0) {
            System.out.println("Вы ввели некорректное число, перезапустите программу и попробуйте снова.");
            System.exit(0);
        }
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (value / i == i) {
                System.out.println("Квадратный корень из " + value + " равен " + i);
            } else {
                System.out.println("У числа " + value + " нет целого квадратного корня.");
                break;
            }
        }

    }
}

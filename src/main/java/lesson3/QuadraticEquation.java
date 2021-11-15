package lesson3;

import java.util.Scanner;

public class QuadraticEquation {



    public static void main(String[] args) {
        System.out.println("Введите три коэфицента");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if (a == 0) {
            System.out.println("Первый коэфицент не может быть 0, перезапустите программу и введите корректные данные.");
            System.exit(0);
        }

        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Нет действительных решений уравнения.");
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Переменная x1 = x2 = " + x);
        } else {
            double x1 = -b + Math.sqrt(d) / (2 * a);
            double x2 = -b - Math.sqrt(d) / (2 * a);
            System.out.print("Переменная x1 = " + x1 + ", ");
            System.out.print("переменная x2 = " + x2);
        }
    }
}




    /* a*(x*x) + b*x + с == 0
     D == b*b - 4*a*c
    при D>0 x1,x2 ==(-b +- корень из D) / 2*a
    при D==0 x1,x2 == -b/(2*a)
    при D<0 нет решений */


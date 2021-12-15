package lesson10;

import java.util.Scanner;

public class ConverterRunner implements Convertible {

    public static void main(String[] args) {

    ConverterRunner convert = new ConverterRunner();

        System.out.println("Введите название валюты для обмена");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Введите сумму");
        double value = scanner.nextDouble();

        switch (name){
            case "доллары"-> System.out.println("Вы получите " + convert.rubleFromDollar(value) + " рублей.");
            case "рубли" -> System.out.println("Вы получите " + convert.rubleToDollar(value) + " долларов.");
        }
    }
}

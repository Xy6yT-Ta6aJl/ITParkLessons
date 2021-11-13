package lesson2;

public class SimpleMath {


    public static void main(String[] args) {

        int sum = addition(6, 8);
        System.out.println(sum);
        int difference = subtraction(55, 28);
        System.out.println(difference);
        int product = multiplication(22, 8);
        System.out.println(product);
        int quotient = division(21, 3);
        System.out.println(quotient);
    }

    public static int addition(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static int subtraction(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static int multiplication(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int division(int arg1, int arg2) {
        return arg1 / arg2;
    }
}

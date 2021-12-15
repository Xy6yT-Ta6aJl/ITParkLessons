package lesson10;

public interface Convertible {

    double COURSE_OF_DOLLAR = 73.84;

    default double rubleToDollar(double value){
        return value / COURSE_OF_DOLLAR;
    }

    default double rubleFromDollar(double value){
        return value * COURSE_OF_DOLLAR;
    }
}

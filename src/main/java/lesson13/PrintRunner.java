package lesson13;

import java.util.ArrayList;
import java.util.Collection;

import static lesson13.AddEmployee.fillArrayList;
import static lesson13.PrintEmployee.printEmployee;

public class PrintRunner {

    public static void main(String[] args) {


        Collection<Employee> employees = new ArrayList<>();
        fillArrayList(employees);
        printEmployee(employees);
    }
}

package lesson13;

import java.util.Collection;

public class PrintEmployee {

    public static void printEmployee(Collection<Employee> employees){

        for(Employee emp : employees){
            if(emp.getExperience()==10){
                System.out.println(emp);
            }
        }

    }
}

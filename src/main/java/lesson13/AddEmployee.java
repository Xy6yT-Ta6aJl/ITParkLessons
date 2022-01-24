package lesson13;

import lesson14.Name;

import java.util.Collection;
import java.util.Random;

public class AddEmployee {

    public static void fillArrayList(Collection<Employee> employees) {
        for (int i = 0; i < 100; i++) {
            Employee employee = new Employee();
            employee.setId(new Random().nextInt(1000));
            employee.setFirstName(Name.getRandomName());
            employee.setSecondName(Name.getRandomSecondName());
            employee.setThirdName(Name.getRandomThirdName());
            employee.setExperience(new Random().nextInt(20));
            employees.add(employee);
        }
    }
}

//TODO  • Дополнительно необходимо реализовать метод удаления элементов коллекции,
// стоящих на нечетных позициях, обходя список с конца.
// Для обхода коллекции использовать итератор.
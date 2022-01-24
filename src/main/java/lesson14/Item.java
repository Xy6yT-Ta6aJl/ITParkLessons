package lesson14;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Item {

    private String number;
    private String firstName;
    private String secondName;
    private String thirdName;

    public Item() {
    }

    public Item(String number, String firstName, String secondName, String thirdName) {
        this.number = number;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    private List<String> listOfNumbers = new ArrayList<>();

    public void addNumberToListOfNumbers(String number) {
        if (listOfNumbers == null) {
            listOfNumbers = new ArrayList<String>();
        }
        listOfNumbers.add(number);
    }


    @Override
    public String toString() {
        return "Item{" +
                "number='" + number + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", listOfNumbers=" + listOfNumbers +
                ", thirdName='" + thirdName + '\'' +
                '}';
    }

}
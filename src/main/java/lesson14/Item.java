package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Item {
    public Item(String number, String firstName, String secondName, String thirdName) {
        this.number = number;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public Item() {

    }

    private String number;
    private String firstName;
    private String secondName;

    public List<String> getListOfNumbers() {
        return listOfNumbers;
    }

    public void setListOfNumbers(List<String> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public void  addNumberToListOfNumbers(String number){
        if (listOfNumbers==null){
            listOfNumbers = new ArrayList<String>();
        }
        listOfNumbers.add(number);
    }

    private List<String> listOfNumbers = new ArrayList<>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
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

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    private String thirdName;

}
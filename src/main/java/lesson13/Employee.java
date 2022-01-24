package lesson13;

public class Employee {


    public Employee() {
    }

    private String firstName;
    private String secondName;
    private String thirdName;
    private int id;
    private int experience;

    public Employee(String firstName, String secondName, String thirdName, int id, int experience) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.id = id;
        this.experience = experience;
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

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return
                secondName + " "
                        + firstName + " "
                        + thirdName + ""
                        + ", id = " + id
                        + ", experience = "
                        + experience + "; ";
    }
}

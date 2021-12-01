package lesson7_8;

public class Dog extends Animals{

    @Override
    public void run(int runDistance) {
        System.out.println("Печенег пробежал " + runDistance + " метров.");
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Печенег проплыл " + swimDistance + " метров.");
    }
}

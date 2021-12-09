package lesson7_8;

public class Tiger extends Animal {

    @Override
    public void run(int runDistance) {
        System.out.println("Полосатый пробежал " + runDistance + " метров.");
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Полосатый проплыл " + runDistance + " метров.");
    }
}

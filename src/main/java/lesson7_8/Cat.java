package lesson7_8;

public class Cat extends Animal {

    @Override
    public void run(int runDistance) {
        System.out.println("Маркиз пробежал " + runDistance + " метров.");
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Маркиз не умеет плавать!");
    }
}

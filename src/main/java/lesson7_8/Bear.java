package lesson7_8;

public class Bear extends Animals{

    @Override
    public void run(int runDistance) {
        System.out.println("Потапыч пробежал " + runDistance + " метров.");
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Потапыч проплыл " + runDistance + " метров.");
    }
}

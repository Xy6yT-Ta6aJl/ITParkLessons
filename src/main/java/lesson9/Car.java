package lesson9;

final class Car extends Automobile{

    public Car(String name) {
        super(name);

    }

    @Override
    public void move(int distance) {
        System.out.println(this.name + " Проехал " + distance);
    }
}

package lesson9;

final class Truck extends Automobile{

    public Truck(String name) {
        super(name);
    }

    @Override
    public void move(int distance) {
        System.out.println(this.name + " Проехал " + distance);

    }
}

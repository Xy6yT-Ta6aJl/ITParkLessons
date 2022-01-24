package test;

public class Car {
    private int power;
    private final String serialNumber;
    public Car(){
        serialNumber = "";
    }

    public Car(int power, String serialNumber) {
        this.power = power;
        this.serialNumber = serialNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    protected void printSerialNumber() {
        System.out.println(serialNumber);
    }

    //Способ 1 - Сlass.forName(“имя.пакета.ИмяКласса”)
    Class<?> carClass;
    {
        try {
            carClass = Class.forName("test.Car");
        } catch (ClassNotFoundException e) {
            System.out.println("Класс не найден");
        }
    }

    //Способ 2 - метод getClass() у экземпляра класса
    Car car = new Car();
    Class<? extends Car> carClass2 = car.getClass();

    //Способ 3 - ИмяКласса.class
    Class<Car> carClass3 = Car.class;
}

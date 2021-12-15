package lesson11;

public class MoveWithCheckpointRunner extends Automobile{

    public static void main(String[] args) {

    Automobile automobile = new Automobile();

    automobile.setSpeed((int)(Math.random()*200));
    automobile.setRegNumber(1236);
    automobile.setWeight(Math.random()*20);
    automobile.setWidth(1.6);
    automobile.setLength(3.8);
    automobile.setHeight(1.7);
    automobile.setType();

        Automobile automobile2 = new Automobile();

        automobile2.setSpeed((int)(Math.random()*200));
        automobile2.setRegNumber(1236);
        automobile2.setWeight(Math.random()*20);
        automobile2.setWidth(1.6);
        automobile2.setLength(3.8);
        automobile2.setHeight(1.7);
        automobile2.setType();

        


    }


}



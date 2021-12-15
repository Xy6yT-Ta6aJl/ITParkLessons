package lesson7_8;

public class Animal {
    int runDistance, swimDistance;
    String voice;

    public void run(int runDistance){
        System.out.println("Пробежал " + runDistance + " Метров.");
    }

    public void swim(int swimDistance){
        System.out.println("Проплыл " + swimDistance + " Метров.");
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void speak(String voice){
        System.out.println(voice);
    }


}

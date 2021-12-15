package lesson7_8;

public class Runner {
    public static void main(String[] args) {

        Dog pecheneg = new Dog();
        pecheneg.runDistance = 500;
        pecheneg.swimDistance = 300;
        pecheneg.run(pecheneg.runDistance);
        pecheneg.swim(pecheneg.swimDistance);

        Cat markiz = new Cat();
        markiz.runDistance = 300;
        markiz.swimDistance = 0;
        markiz.run(markiz.runDistance);
        markiz.swim(markiz.swimDistance);

        Tiger polosatiy = new Tiger();
        polosatiy.runDistance = 1300;
        polosatiy.swimDistance = 800;
        polosatiy.run(polosatiy.runDistance);
        polosatiy.swim(polosatiy.swimDistance);

        Bear potapich = new Bear();
        potapich.runDistance = 1000;
        potapich.swimDistance = 1000;
        potapich.run(potapich.runDistance);
        potapich.swim(potapich.swimDistance);

        System.out.println("------------------------------------------------");

        pecheneg.setVoice("Гав-гав");
        markiz.setVoice("Мяу-мяу");
        polosatiy.setVoice("Р-р-р-р-р-р");
        potapich.setVoice("Привет брат, медку бы.");

        Animal[] animals = new Animal[]{pecheneg, markiz, polosatiy, potapich};
        for (Animal anim:animals) {
            anim.speak(anim.voice);
        }
    }
}

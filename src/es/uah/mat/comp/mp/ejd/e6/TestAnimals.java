package es.uah.mat.comp.mp.ejd.e6;

public class TestAnimals {
    public static void main(String[] args) {

        Animal cat = new Cat("Whiskers");
        Animal dog1 = new Dog("Rober");
        Dog bigDog = new BigDog("Bruno");
        Dog dog2 = new Dog("Rober2");
        BigDog bigDog2 = new BigDog("Bruno2");
        Dog dog3 = new Dog("Rober3");

        cat.greets();
        dog1.greets();
        bigDog.greets();

        dog2.greets(dog3);
        bigDog.greets(dog2);
        bigDog2.greets(bigDog2);

    }
}

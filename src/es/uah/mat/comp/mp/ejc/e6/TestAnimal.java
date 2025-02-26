package es.uah.mat.comp.mp.ejc.e6;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Emmily the Dog");
        System.out.println(animal1);
        System.out.println(animal1.toString());

        Cat cat1 = new Cat("Ines");
        System.out.println(cat1);
        System.out.println(cat1.toString());

        Cat cat2 = new Cat("Luna");
        System.out.println(cat2);
        System.out.println(cat2.toString());

        Dog dog1 = new Dog("Coral");
        System.out.println(dog1);
        System.out.println(dog1.toString());

        Dog dog2 = new Dog("Emma");
        System.out.println(dog2);
        System.out.println(dog2.toString());

        cat1.greets();
        cat2.greets();

        dog1.greets();
        Dog dog3 = new Dog("Rober");
        dog2.greets(dog3);
    }
}

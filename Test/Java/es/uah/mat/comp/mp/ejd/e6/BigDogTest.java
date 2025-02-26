package es.uah.mat.comp.mp.ejd.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {
    @Test
    void greets() {
        Animal dog = new BigDog("Rufus");
        dog.greets();
    }

    @Test
    void testGreets() {
        Dog dog1 = new BigDog("Rufus");
        Dog dog2 = new Dog("Rufuss");
        dog1.greets(dog2);
    }

    @Test
    void testGreets1() {
        BigDog dog1 = new BigDog("Rufus");
        BigDog dog2 = new BigDog("Rufuss");
        dog1.greets(dog2);
    }

}
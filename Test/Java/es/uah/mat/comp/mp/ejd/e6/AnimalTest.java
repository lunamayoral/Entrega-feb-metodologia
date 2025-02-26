package es.uah.mat.comp.mp.ejd.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void greets() {
        Animal cat = new Cat("Luna");
        cat.greets();
    }

}
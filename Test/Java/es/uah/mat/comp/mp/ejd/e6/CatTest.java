package es.uah.mat.comp.mp.ejd.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void greets() {
        Animal cat = new Cat("Ines");
        cat.greets();
    }


}
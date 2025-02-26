package es.uah.mat.comp.mp.ejd.e6;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();

}

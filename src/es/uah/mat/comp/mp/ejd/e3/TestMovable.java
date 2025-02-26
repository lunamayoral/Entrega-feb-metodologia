package es.uah.mat.comp.mp.ejd.e3;

public class TestMovable {
    public static void main(String[] args) {
        Movable point = new MovablePoint(5,2,6,8);
        System.out.println("Posicion inicial: " + point);

        point.moveUp();
        point.moveRight();
        System.out.println("Posicion despues del movimiento: " + point);

        point.moveLeft();
        point.moveDown();
        System.out.println("Posicion final: " + point);
    }
}

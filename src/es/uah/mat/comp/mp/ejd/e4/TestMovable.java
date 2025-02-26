package es.uah.mat.comp.mp.ejd.e4;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        System.out.println("Initial position of point: " + point);
        point.moveUp();
        point.moveRight();
        System.out.println("Position after moving: " + point);

        MovableCircle circle = new MovableCircle(2, 2, 2, 2, 5);
        System.out.println("Initial position of circle: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Position after moving: " + circle);
    }
}

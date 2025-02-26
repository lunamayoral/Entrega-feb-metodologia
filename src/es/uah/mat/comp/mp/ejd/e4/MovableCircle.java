package es.uah.mat.comp.mp.ejd.e4;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    //Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString() {
        return center + ", radius=" + radius;
    }

    @Override
    public void moveUp(){
        center.moveUp();
    }

    @Override
    public void moveDown(){
        center.moveDown();
    }

    @Override
    public void moveLeft(){
        center.moveLeft();
    }

    @Override
    public void moveRight(){
        center.moveRight();
    }
}

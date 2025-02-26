package es.uah.mat.comp.mp.ejd.e5;

public class Circle implements GeometricObject {
    protected double radius;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle[radius= " + radius + "]";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

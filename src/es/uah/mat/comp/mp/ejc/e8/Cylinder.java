package es.uah.mat.comp.mp.ejc.e8;

public class Cylinder { // Save as "Cylinder.java"
    private double height; // private variable
    private Circle base;

    // Constructor with default color, radius and height
    public Cylinder() {
        base = new Circle(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default height, color but given radius
    public Cylinder(double radius) {
        base = new Circle(radius); // call superclass constructor Circle(r)
        this.height = 1.0;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        base = new Circle(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius,color);
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // A public method for computing the volume of cylinder
// use superclass method getArea() to get the base area
    public double getVolume() {
        return base.getArea()*height;
    }

    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: " + base.toString() // use Circle's toString()
                + " height=" + height;
    }
}
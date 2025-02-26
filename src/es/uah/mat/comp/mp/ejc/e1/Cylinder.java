package es.uah.mat.comp.mp.ejc.e1;

public class Cylinder extends Circle {
    private double height; // private variable
    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }
    public Cylinder(double radius){
        super(radius);
        this.height=height;
    }

    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius,color); // call superclass constructor Circle(r)
        this.height = height;
    }
    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    // A public method for computing the volume of cylinder
// use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea()*height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }
}


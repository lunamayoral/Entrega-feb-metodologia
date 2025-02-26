package es.uah.mat.comp.mp.ejc.e1;

public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;
// Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
        color = "red";
    }
    /** Constructs a Circle instance with the given radius and default color-KEYWORD */
    public Circle(double radius) { // 2nd constructor
        this.radius=radius;
        color="red";
    }
    // 3rd constructor to construct a new instance of Circle with the given radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }



    /** Returns the radius */
    public double getRadius() {
        return radius;
    }
    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    // Getter for instance variable color
    public String getColor() {
        return color;

    }
    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    // Setter for instance variable color
    public void setColor(String newColor) {
        color = newColor;

    }
    public String toString(){
        return "Circle[radius="+radius+" color="+color+"]";
    }
}


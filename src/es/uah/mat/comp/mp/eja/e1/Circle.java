package es.uah.mat.comp.mp.eja.e1;

public class Circle {
    // Save as "es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)

    /**
     * Constructs a es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle instance with default value for radius and color
     */

    public Circle() {  // 1st (default) constructor
        this.radius = 1.0;
        color = "red";
    }

    /**
     * Constructs a es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle instance with the given radius and default color
     */

    public Circle(double r) {  // 2nd constructor
        this.radius = r;
        color = "red";
    }

    // 3rd constructor to construct a new instance of es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle with the given radius and color
    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    /**
     * Returns the radius
     */

    public double getRadius() {
        return radius;
    }

    /**
     * Returns the area of this es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle instance
     */

    public double getArea() {
        return radius * radius * Math.PI;
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

    /**
     * Return a self-descriptive string of this instance in the form of es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle[radius=?,color=?]
     */

    public String toString() {
        return "es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle[radius=" + radius + " color=" + color + "]";
    }
}




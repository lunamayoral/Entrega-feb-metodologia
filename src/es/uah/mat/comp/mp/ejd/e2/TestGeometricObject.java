package es.uah.mat.comp.mp.ejd.e2;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(4.0);
        System.out.println(circle.toString());
        System.out.println("Área del círculo: " + circle.getArea());
        System.out.println("Perímetro del círculo: " + circle.getPerimeter());


        GeometricObject rectangle = new Rectangle(5.0, 6.0);
        System.out.println(rectangle.toString());
        System.out.println("Área del rectángulo: " + rectangle.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangle.getPerimeter());

    }
}

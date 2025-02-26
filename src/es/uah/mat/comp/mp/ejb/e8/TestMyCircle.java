package es.uah.mat.comp.mp.ejb.e8;

import es.uah.mat.comp.mp.ejb.e6.*;

public class TestMyCircle {
    public static void main(String[] args){
        MyCircle c0 = new MyCircle(); //Test constructor by default
        MyCircle c1 = new MyCircle(1,1,5); //Test constructor by coordinates and radius
        MyPoint c = new MyPoint(2,2);
        MyCircle c2 = new MyCircle(c,10); //Test constructor by center and radius
        System.out.println(c0); //Test toString
        c0.setCenterX(1); //Test setters
        c0.setCenterY(2);
        c0.setRadius(15);
        c2.setCenterXY(3,3);
        c1.setCenter(c);
        int[] center = c2.getCenterXY(); //Test getters
        System.out.println(center[0]+", "+center[1]);
        System.out.println(c0.getCenterX());
        System.out.println(c0.getCenterY());
        System.out.println(c1.getCenter());
        System.out.println(c2.getArea()); //Test getArea
        System.out.println(c2.getCircumference()); //Test getCircumference
        System.out.println(c0.distance(c1)); //Test distance
    }
}

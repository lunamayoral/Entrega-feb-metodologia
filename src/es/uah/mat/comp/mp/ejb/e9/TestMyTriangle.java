package es.uah.mat.comp.mp.ejb.e9;

import es.uah.mat.comp.mp.ejb.e6.*;

public class TestMyTriangle {
    public static void main(String[] args){
        //Test constructors
        MyTriangle t1 = new MyTriangle(0,0,1,0,0,1);
        MyPoint v1 = new MyPoint(1,1);
        MyPoint v2 = new MyPoint(2,2);
        MyPoint v3 = new MyPoint(-3,3);
        MyTriangle t2 = new MyTriangle(v1,v2,v3);
        System.out.println(t1); //Test toString
        System.out.println(t1.getPerimeter()); //Test getPerimeter
        System.out.println(t2.getType()); //Test getType
        System.out.println(t1.getType());
    }
}

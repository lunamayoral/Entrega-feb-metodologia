package es.uah.mat.comp.mp.ejb.e7;

import es.uah.mat.comp.mp.ejb.e6.*;

public class TestMyLine {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l1 = new MyLine(p1,p2); //Test constructor with 2 points
        System.out.println(l1); //Test toString
        l1.setBeginX(3); //Test coord setters
        l1.setBeginY(4);
        l1.setEndX(5);
        l1.setEndY(6);
        System.out.println(l1.getBeginX()); //Test coord getters
        System.out.println(l1.getBeginY());
        System.out.println(l1.getEndX());
        System.out.println(l1.getEndY());
        l1.setEnd(p1); //Test point setters
        l1.setBegin(p2);
        System.out.println(l1.getBegin()); //Test point getters
        System.out.println(l1.getEnd());
        l1.setBeginXY(7,8); //Test 2 coord setters
        l1.setEndXY(9,10);
        int[] begin = l1.getBeginXY(); //Test 2 coord getters
        int[] end = l1.getEndXY();
        System.out.println(begin[0]);
        System.out.println(begin[1]);
        System.out.println(end[0]);
        System.out.println(end[1]);
        MyLine l2 = new MyLine(0,0,-17,0); //Test constructor with coords
        System.out.println(l2.getGradient());
        System.out.println(l2.getLength());
    }
}
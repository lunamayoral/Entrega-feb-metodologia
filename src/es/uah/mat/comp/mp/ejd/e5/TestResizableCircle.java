package es.uah.mat.comp.mp.ejd.e5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle r = new ResizableCircle(5);
        System.out.println(r.toString());

        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());

        r.resize(50);
        System.out.println(r.toString());

    }
}

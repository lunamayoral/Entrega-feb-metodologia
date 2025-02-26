package es.uah.mat.comp.mp.ejb.e6;

import java.util.Locale;

public class TestMatrizDistancia {
    public static void main(String[] args) {
        // Creamos un array de 10 puntos
        MyPoint[] points = new MyPoint[10];

        // Inicializamos los puntos (1,1), ..., (10,10)
        for (int n = 0; n < points.length; n++) {
            points[n] = new MyPoint(n + 1, n + 1);
        }

        // Mostramos la matriz de distancias
        System.out.println("Matriz Distancia: ");
        for (int n = 0; n < points.length; n++) {
            for (int m = 0; m < points.length; m++) {
                double distance = points[n].distance(points[m]);
                System.out.printf(Locale.US, "%.2f ", distance);
            }
            System.out.println();
        }
    }
}

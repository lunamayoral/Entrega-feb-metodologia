package es.uah.mat.comp.mp.ejc.e7;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub line1 = new LineSub(5,8,3,4);
        LineSub line2 = new LineSub(6,2,1,4);
        System.out.println(line1);
        System.out.println(line2);

        Point p1 = new Point(2,6);
        Point p2 = new Point(3,2);
        LineSub line3 = new LineSub(p1,p2);
        System.out.println(line3);

        System.out.println("Coordenadas de inicio: (" + line1.getBeginX() + ", " + line1.getBeginY() + ")");
        System.out.println("Coordenadas de fin: (" + line1.getEndX() + ", " + line1.getEndY() + ")");

        // Calcular y mostrar la longitud de la línea
        System.out.println("Longitud de la línea: " + line1.getLength());

        // Calcular y mostrar el gradiente de la línea
        System.out.println("Gradiente de la línea (radianes): " + line1.getGradient());

        // Modificar la línea
        line1.setEndXY(7, 8);
        System.out.println("Línea 1 después de modificar el punto final: " + line1);
        System.out.println("Nueva longitud de la línea: " + line1.getLength());

        // Crear otra línea usando el constructor con coordenadas
        LineSub line4 = new LineSub(0, 0, 3, 4);
        System.out.println("Línea 4: " + line4);
        System.out.println("Longitud de la línea 4: " + line4.getLength());
    }
}




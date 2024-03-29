package desafio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1012_Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaTriangulo = (A * C)/2;
        double areaCirculo = pi * (Math.pow(C, 2));
        double areaTrapezio = (0.5 * (C * (A + B)));
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
        sc.close();
    }
}
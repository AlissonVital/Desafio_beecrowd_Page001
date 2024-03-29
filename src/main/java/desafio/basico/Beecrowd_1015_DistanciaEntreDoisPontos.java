package desafio.basico;

import java.util.Scanner;

public class Beecrowd_1015_DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        double distancia = Math.sqrt((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));

        System.out.printf("%.4f\n", distancia);
        sc.close();
    }
}
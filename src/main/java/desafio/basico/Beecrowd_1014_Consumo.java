package desafio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1014_Consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double distancia = X/Y;

        System.out.printf("%.3f km/l\n", distancia);
    }
}
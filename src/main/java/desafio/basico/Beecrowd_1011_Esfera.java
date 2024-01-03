package desafio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1011_Esfera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        double R = sc.nextDouble();

        double volume = (1.33333333333333*pi) * (Math.pow(R, 3));

        System.out.printf("VOLUME = %.3f\n", volume);
        sc.close();
    }
}
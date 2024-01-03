package desafio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1037_Intervalo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();

        if (A >= 0 && A <= 25.00000) {
            System.out.println("Intervalo [0,25]");
        } else if (A > 25.00000 && A <= 50.00000) {
            System.out.println("Intervalo (25,50]");
        }else if (A > 50.00000 && A <= 75.00000) {
            System.out.println("Intervalo (50,75]");
        }else if (A > 75.00000 && A <= 100.00000) {
            System.out.println("Intervalo (75,100]");
        }else {
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }
}

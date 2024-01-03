package desafio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1003_SomaSimples {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int soma = A+B;

        System.out.println("X = " + soma);
        sc.close();
    }
}

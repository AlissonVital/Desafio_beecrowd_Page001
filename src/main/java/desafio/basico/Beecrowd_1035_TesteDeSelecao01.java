package desafio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1035_TesteDeSelecao01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int AB, CD;
        AB = A + B;
        CD = C + D;

        if ((A%2==0) && (B > C) && (C >= 0) && (D > A) && (D >= 0) && (CD > AB)) {
            System.out.println("Valores aceitos");
        } else System.out.println("Valores nao aceitos");

        sc.close();
    }
}
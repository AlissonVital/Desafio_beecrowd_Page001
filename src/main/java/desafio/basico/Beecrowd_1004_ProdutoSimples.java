package desafio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1004_ProdutoSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int prod = A*B;

        System.out.println("PROD = " + prod);
        sc.close();
    }
}
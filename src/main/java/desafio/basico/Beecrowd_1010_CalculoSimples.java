package desafio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1010_CalculoSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod01 = sc.nextInt();
        int qtdPecas01 = sc.nextInt();
        double valorUn01 = sc.nextDouble();
        int cod02 = sc.nextInt();
        int qtdPecas02 = sc.nextInt();
        double valorUn02 = sc.nextDouble();

        double totalPagar = (qtdPecas01*valorUn01) + (qtdPecas02*valorUn02);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);
        sc.close();
    }
}
package desafio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1009_SalarioComBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salarioBruto = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double salarioLiquido = (totalVendas * 0.15) + salarioBruto;

        System.out.printf("TOTAL = R$ %.2f\n", salarioLiquido);
        sc.close();
    }
}
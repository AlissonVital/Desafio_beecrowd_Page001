package desafio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1008_Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double salHora = sc.nextDouble();

        double salario = horasTrabalhadas * salHora;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        sc.close();
    }
}
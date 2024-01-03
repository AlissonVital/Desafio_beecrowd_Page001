package desafio.basico;

import java.util.Scanner;

public class Beecrowd_1020_IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int resto = 0;

        int h = idade / 365;
        resto = idade % 365;
        int m = resto / 30;
        int s = resto % 30;

        System.out.println(h + " ano(s)");
        System.out.println(m + " mes(es)");
        System.out.println(s + " dia(s)");

        sc.close();
    }
}
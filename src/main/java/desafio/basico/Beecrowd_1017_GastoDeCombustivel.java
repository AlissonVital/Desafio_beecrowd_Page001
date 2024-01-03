package desafio.basico;

import java.util.Scanner;

public class Beecrowd_1017_GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        System.out.println(numero);

        int resto = numero % 100;

        if (numero >= 100) {
            int parcela = numero / 100;
            System.out.println(parcela + " nota(s) de R$ 100,00");
        } else System.out.println("0 nota(s) de R$ 100,00");
        numero = resto;
        if (numero >= 50) {
            numero = numero - 50;
            System.out.println("1 nota(s) de R$ 50,00");
        } else System.out.println("0 nota(s) de R$ 50,00");
        if (numero >= 40) {
            numero = numero - 40;
            numero = numero - 20;
            System.out.println("2 nota(s) de R$ 20,00");
        } else if (numero >= 20) {
            numero = numero - 20;
            System.out.println("1 nota(s) de R$ 20,00");
        } else System.out.println("0 nota(s) de R$ 20,00");
        if (numero >= 10) {
            numero = numero - 10;
            System.out.println("1 nota(s) de R$ 10,00");
        } else System.out.println("0 nota(s) de R$ 10,00");
        if (numero >= 5) {
            numero = numero - 5;
            System.out.println("1 nota(s) de R$ 5,00");
        } else System.out.println("0 nota(s) de R$ 5,00");
        if (numero == 4) {
            numero = numero - 4;
            System.out.println("2 nota(s) de R$ 2,00");
        } else if (numero >= 2) {
            numero = numero - 2;
            System.out.println("1 nota(s) de R$ 2,00");
        } else System.out.println("0 nota(s) de R$ 2,00");
        if (numero == 1) {
            numero = numero - 1;
            System.out.println("1 nota(s) de R$ 1,00");
        } else System.out.println("0 nota(s) de R$ 1,00");
    }
}
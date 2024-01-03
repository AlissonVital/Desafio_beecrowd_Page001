package desafio.basico;

import java.util.Scanner;

public class Beecrowd_1016_Distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velocidade = sc.nextInt();

        System.out.println(velocidade*2 + " minutos");
        sc.close();
    }
}
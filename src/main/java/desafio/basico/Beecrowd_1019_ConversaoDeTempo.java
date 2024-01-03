package desafio.basico;

import java.util.Scanner;

public class Beecrowd_1019_ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int resto = 0;

        int h = N/3600;
        resto = N % 3600;
        int m = resto/60;
        int s = resto%60;

        System.out.print(h+":");
        System.out.print(m+":");
        System.out.println(s);

        sc.close();
    }
}
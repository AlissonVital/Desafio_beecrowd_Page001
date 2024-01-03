package desafio.basico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Beecrowd_1002_AreaCirculo {
    public static void main(String[] args) {
        double n = 3.14159;
        Scanner sc = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0000");

        double area, raio;
        raio = sc.nextDouble();
        area = n * (raio*raio);

        System.out.print("A=");
        System.out.println(deci.format(area));
        sc.close();
    }
}
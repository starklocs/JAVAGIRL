package SegundoSemestre;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite três números: ");

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " é o maior número");
        } else if (b > a && b > c) {
            System.out.println(b + " é o maior número");
        } else {
            System.out.println(c + " é o maior número");
        }
        entrada.close();
    }

}

package SegundoSemestre;
import java.util.Scanner;
    public class Ordenação{
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o valor de i: ");
            int i = entrada.nextInt();

            System.out.print("Digite o valor de a: ");
            double a = entrada.nextDouble();

            System.out.print("Digite o valor de b: ");
            double b = entrada.nextDouble();

            System.out.print("Digite o valor de c: ");
            double c = entrada.nextDouble();

            if (i == 1) {
                if (a <= b && b <= c) {
                    System.out.println(a + ", " + b + ", " + c);
                } else if (a <= c && c <= b) {
                    System.out.println(a + ", " + c + ", " + b);
                } else if (b <= a && a <= c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else if (b <= c && c <= a) {
                    System.out.println(b + ", " + c + ", " + a);
                } else if (c <= a && a <= b) {
                    System.out.println(c + ", " + a + ", " + b);
                } else {
                    System.out.println(c + ", " + b + ", " + a);
                }
            } else if (i == 2) {
                if (a >= b && b >= c) {
                    System.out.println(a + ", " + b + ", " + c);
                } else if (a >= c && c >= b) {
                    System.out.println(a + ", " + c + ", " + b);
                } else if (b >= a && a >= c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else if (b >= c && c >= a) {
                    System.out.println(b + ", " + c + ", " + a);
                } else if (c >= a && a >= b) {
                    System.out.println(c + ", " + a + ", " + b);
                } else {
                    System.out.println(c + ", " + b + ", " + a);
                }
            } else if (i == 3) {
                if (a >= b && a >= c) {
                    if (b >= c) {
                        System.out.println(a + ", " + b + ", " + c);
                    } else {
                        System.out.println(a + ", " + c + ", " + b);
                    }
                } else if (b >= a && b >= c) {
                    if (a >= c) {
                        System.out.println(b + ", " + a + ", " + c);
                    } else {
                        System.out.println(b + ", " + c + ", " + a);
                    }
                } else {
                    if (a >= b) {
                        System.out.println(c + ", " + a + ", " + b);
                    } else {
                        System.out.println(c + ", " + b + ", " + a);
                    }
                }
            } else {
                System.out.println("Valor de i inválido.");
                }
            }

    }
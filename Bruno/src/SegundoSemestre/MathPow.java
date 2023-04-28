package SegundoSemestre;

import java.util.Scanner;

public class MathPow {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe 3 números");
		int numero1 = entrada.nextInt();
		int numero2 = entrada.nextInt();
		int numero3 = entrada.nextInt();

		double resultado = Math.pow(numero1 + numero2, 2);
		System.out.println("Resultado de C = (A + B)² é: " + resultado);

		double resultado2 = Math.pow(numero2 + numero3, 2);
		System.out.println("Resultado de S = (B + C)² é: " + resultado2);

		entrada.close();
	}
}

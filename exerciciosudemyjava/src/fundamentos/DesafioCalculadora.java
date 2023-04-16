package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("\nInforme um numero: ");
		double numero1 = entrada.nextDouble();

		System.out.println("\nInforme outro numero: ");
		double numero2 = entrada.nextDouble();

		System.out.println("Digite o operador (+, -, *, /):");
		String operador = entrada.next();

		double resultado = "+".equals(operador) ? numero1 + numero2 : 0;
		resultado = "-".equals(operador) ? numero1 - numero2 : resultado;
		resultado = "*".equals(operador) ? numero1 * numero2 : resultado;
		resultado = "/".equals(operador) ? numero1 / numero2 : resultado;

		System.out.printf("\n%.2f %s %.2f = " + resultado, numero1, operador, numero2);

	}
}

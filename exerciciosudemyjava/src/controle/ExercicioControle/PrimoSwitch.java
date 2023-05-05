package controle.ExercicioControle;

import java.util.Scanner;

public class PrimoSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = entrada.nextInt();

		boolean ehPrimo = true;

		switch (numero) {
		case 0:
		case 1:
			ehPrimo = false;
			break;
		default:
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					ehPrimo = false;
					break;
				}
			}
			break;
		}

		if (ehPrimo) {
			System.out.println(numero + " é um número primo.");
		} else {
			System.out.println(numero + " não é um número primo.");
		}

		entrada.close();
	}
}

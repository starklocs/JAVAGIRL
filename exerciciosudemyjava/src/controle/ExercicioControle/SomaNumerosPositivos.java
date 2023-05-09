package controle.ExercicioControle;

import java.util.Scanner;

public class SomaNumerosPositivos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero, soma = 0;

		System.out.println(
				"Digite números positivos para serem somados. Digite um número negativo para encerrar o programa. ");

		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();

			if (numero >= 0) {
				soma += numero;
			}

		} while (numero >= 0);
		System.out.println("A soma dos números positivos digitados é: " + soma);
		entrada.close();
	}
}

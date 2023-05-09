package controle.ExercicioControle;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: ", i);
			int numero = entrada.nextInt();

			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println("O maior número digitado foi: " + maior);
	}
}

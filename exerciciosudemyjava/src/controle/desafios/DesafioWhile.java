package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		double nota;
		int quantidadeNotas = 0;
		double total = 0;

		do {
			System.out.println("Digite o valor de uma nota válida (ou um número negativo para sair):");
			nota = entradas.nextDouble();

			if (nota >= 0 && nota <= 10) {
				quantidadeNotas++;
				total += nota;
			} else if (nota >= 0) {
				System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
			}
		} while (nota >= 0);

		System.out.println("Quantidade de notas válidas digitadas: " + quantidadeNotas);
		System.out.println("O valor total das notas é: " + total);
		entradas.close();
	}
}

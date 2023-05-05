package controle.ExercicioControle;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2) / 2;

		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media >= 4.0 && media < 7.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}

		entrada.close();
	}

}

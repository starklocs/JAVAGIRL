package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o dia da semana: ");
		
		String diaDaSemana = entrada.nextLine().toLowerCase();

		if (diaDaSemana.equals("domingo")) {
			System.out.println("1");
		} else if (diaDaSemana.equals("segunda")) {
			System.out.println("2");
		} else if (diaDaSemana.equals("terça") || diaDaSemana.equals("terca")) {
			System.out.println("3");
		} else if (diaDaSemana.equals("quarta")) {
			System.out.println("4");
		} else if (diaDaSemana.equals("quinta")) {
			System.out.println("5");
		} else if (diaDaSemana.equals("sexta")) {
			System.out.println("6");
		} else if (diaDaSemana.equals("sábado") || diaDaSemana.equals("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia inválido");
		}

		entrada.close();

	}
}

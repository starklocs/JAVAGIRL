package SegundoSemestre;

import java.util.Scanner;

public class TrocaDePalavra {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira uma palavra: ");
		String palavra1 = entrada.nextLine();

		System.out.println("Insira a segunda palavra: ");
		String palavra2 = entrada.nextLine();

		String auxiliar = palavra1;
		palavra1 = palavra2;
		palavra2 = auxiliar;

		System.out.println("Palavra 1: " + palavra1);
		System.out.println("Palavra 2: " + palavra2);

	}
}

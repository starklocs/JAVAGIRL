package SegundoSemestre;

import java.util.Scanner;

public class ClassificarNadador {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a idade do nadador: ");
		int idade = entrada.nextInt();

		if (idade >= 5 && idade <= 7) {
			System.out.println("Categoria Infantil A");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Categoria Infantil B");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("Categoria Juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Categoria Juvenil B");
		} else if (idade >= 18) {
			System.out.println("Categoria Adulto");
		} else {
			System.out.println("Idade inválida");
		}

		entrada.close();
	}
}

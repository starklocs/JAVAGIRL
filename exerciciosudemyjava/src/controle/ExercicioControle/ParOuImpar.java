package controle.ExercicioControle;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();

		if (numero >= 0 && numero <=10) {
			if (numero % 2 == 0) {
				System.out.println("O número " + numero + " é par e está dentro do intervalo de 0 a 10.");
			} else {
				System.out.println("O número " + numero + " não é par.");
			} 
		} else {
			System.out.println("O número " + numero + " não está dentro do intervalo de 0 a 10.");
		}
		entrada.close();
	}
}

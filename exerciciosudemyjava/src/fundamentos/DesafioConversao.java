package fundamentos;

import java.util.Scanner;
public class DesafioConversao {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu salário: ");
		String salario1 = entrada.nextLine();

		System.out.println("Digite o seu salário: ");
		String salario2 = entrada.nextLine();

		System.out.println("Digite o seu salário: ");
		String salario3 = entrada.nextLine();

		double sal1 = Double.parseDouble(salario1.replace(',', '.'));
		double sal2 = Double.parseDouble(salario2.replace(',', '.'));
		double sal3 = Double.parseDouble(salario3.replace(',', '.'));

		double soma = sal1 + sal2 + sal3;

		System.out.println("A SOMA DOS SALÁRIOS É: " + soma);
		System.out.println("A MÉDIA DOS DOS SALÁRIOS É: " + soma / 3);

		entrada.close();
	}
}

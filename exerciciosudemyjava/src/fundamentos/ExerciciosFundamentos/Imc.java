package fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o seu peso? ");
		double peso = entrada.nextDouble();

		System.out.println("Qual a sua altura? ");
		double altura = entrada.nextDouble();
		

		double imc = peso / (altura * altura);

		System.out.printf("O seu IMC é: %.2f",  imc);

	}
}

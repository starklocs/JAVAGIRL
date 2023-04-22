package fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o seu peso? ");
        String pesoStr = entrada.next().replace(",", ".");
        double peso = Double.parseDouble(pesoStr);

        System.out.println("Qual a sua altura? ");
        String alturaStr = entrada.next().replace(",", ".");
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f", imc);

        entrada.close();

	}
}

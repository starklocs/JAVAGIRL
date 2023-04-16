package fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {

		System.out.println("Qual a temperatura em Celsius?");

		Scanner entrada = new Scanner(System.in);
		int celsius = entrada.nextInt();
		double fahrenheit = celsius * 9 / 5 + 32;

		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "F");
	}
}

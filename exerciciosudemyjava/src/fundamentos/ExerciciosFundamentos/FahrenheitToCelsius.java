package fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {

		System.out.println("Quantos graus em Fahrenheit?");
		Scanner entrada = new Scanner(System.in);

		int fahrenheit = entrada.nextInt();
		int celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("A temperatura em Celsius é de: " + celsius + "°C");

		entrada.close();
	}
}

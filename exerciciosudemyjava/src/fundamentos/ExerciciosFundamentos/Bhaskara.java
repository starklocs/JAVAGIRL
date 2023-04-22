package fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o coeficiente a:");
		double a = entrada.nextDouble();

		System.out.println("Entre com o coeficiente b:");
		double b = entrada.nextDouble();

		System.out.println("Entre com o coeficiente c:");
		double c = entrada.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("As raízes são %.2f e %.2f", x1, x2);

		entrada.close();
	}
}

package fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class BaseTriangulo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual a base do triângulo?");
		double baseTriangulo = entrada.nextDouble();

		System.out.println("Qual a altura do triângulo?");
		double alturaTriangulo = entrada.nextDouble();

		double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

		System.out.println("A área do triangulo é " + areaTriangulo);

		entrada.close();
	}
}

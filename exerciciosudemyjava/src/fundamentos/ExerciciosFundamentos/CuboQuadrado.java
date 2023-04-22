package fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class CuboQuadrado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("\n Qual o numero que adeseja elevar ao quadrado?");
		double quadrado = entrada.nextDouble();
		quadrado = Math.pow(quadrado, 2);
		System.out.println("A o quadrado do numero é: " + quadrado);

		System.out.println("\n Qual o numero que adeseja elevar ao cubo?");
		double cubo = entrada.nextDouble();
		cubo = Math.pow(cubo, 3);
		System.out.println("A o cubo do numero é: " + cubo);
		
		entrada.close();

	}
}

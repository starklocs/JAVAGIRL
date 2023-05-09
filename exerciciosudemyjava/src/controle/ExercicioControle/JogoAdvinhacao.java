package controle.ExercicioControle;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class JogoAdvinhacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();
		
		int numeroAleatorio = gerador.nextInt(101);
		int numeroDeTentativas = 10;
		Set<Integer> numerosDigitados = new HashSet<>();
		
		System.out.println("Bem vindo ao jogo de adivinhação!");
		System.out.println("Você tem 10 tentativas para adivinhar um número entre 0 e 100.");
		
		while (numeroDeTentativas > 0) {
            System.out.printf("Tentativa %d. Digite um número: ", 11 - numeroDeTentativas);
            int numero = entrada.nextInt();

            if (numerosDigitados.contains(numero)) {
                System.out.println("Número já digitado. Digite um número diferente.");
                continue;
            }

            numerosDigitados.add(numero);
			
			if (numero == numeroAleatorio) {
				System.out.println("Parabéns você acertou o número!");
				break;
			} else if (numero > numeroAleatorio) {
				System.out.println("O número inserido é menor do que o número a ser advinhado.");
			} else {
				System.out.println("O número inserido é maior do que o número a ser advinhado.");
			}
			
			numeroDeTentativas--;
			System.out.println("Tentativas restantes: " + numeroDeTentativas);
		}
		
		if (numeroDeTentativas == 0) {
			System.out.println("Fim de jogo. Você não acertou o número. O número a ser adivinhado era " + numeroAleatorio + ".");
		}
		
		entrada.close();
	}
}

package controle.ExercicioControle;

import java.time.Year;

public class AnoBissexto {
	public static void main(String[] args) {
		int anoAtual = Year.now().getValue();

		if (anoAtual % 4 == 0 && (anoAtual % 100 != 0 || anoAtual % 400 == 0)) {
			System.out.println("O ano atual " + anoAtual + " é bissexto.");
		} else {
			System.out.println("O ano atual " + anoAtual + " não é bissexto.");
		}
	}
}

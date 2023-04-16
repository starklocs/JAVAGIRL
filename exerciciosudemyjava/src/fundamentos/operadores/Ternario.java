package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {

		double media = 8.6;
		String resultadoParcial = media >= 5.0 ?
				"de recuperação." : "Reprovado.";
		String resultadoFinal = media >= 7.0 ?
				"Aprovado." : resultadoParcial;

		System.out.println("O aluno está " + resultadoFinal);
	}
}

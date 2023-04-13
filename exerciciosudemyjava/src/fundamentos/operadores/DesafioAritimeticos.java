package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {

		double resultado1 = Math.pow(6 * (3 + 2), 2) / (3 * 2);
		double resultado2 = Math.pow((1 - 5) * (2 - 7) / 2, 2);
		double resultado3 = resultado1 - resultado2;
		double resultadoFinal = Math.pow(resultado3, 3) / Math.pow(10, 3);
		System.out.println(resultadoFinal);

	}
}

package controle.desafios;

public class DesafioFor {
	public static void main(String[] args) {

		String objetivo = "#####";
		
		for (String valor = "#"; valor.length() <= objetivo.length(); valor += "#") {
			System.out.println(valor);
		}
	}
}

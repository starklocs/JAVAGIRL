package controle.desafios;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
        String objetivo = "#####";
        for (; valor.length() <= objetivo.length(); valor += "#") {
            System.out.println(valor);
        }
    }
}

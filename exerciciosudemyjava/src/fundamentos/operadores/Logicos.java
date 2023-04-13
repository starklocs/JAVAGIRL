package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {

		boolean vouAoCinema = true;
		boolean naoEstaChovendo = false;

		System.out.println(vouAoCinema && naoEstaChovendo); // and
		System.out.println(vouAoCinema || naoEstaChovendo); // or
		System.out.println(vouAoCinema ^ naoEstaChovendo); // xor
		System.out.println(!vouAoCinema); // not
		System.out.println(!naoEstaChovendo); // not

		System.out.println("\nTabela Verdade E / AND");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("\nTabela Verdade OU / OR");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("\nTabela Verdade XOU / XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade NÃO / NOT");
		System.out.println(!true);
		System.out.println(!false);

	}
}

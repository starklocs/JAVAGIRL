package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {

		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		boolean comprouTv50Polegadas = trabalhoTerca && trabalhoQuinta;
		boolean comprouTV32Polegadas = trabalhoTerca ^ trabalhoQuinta;
		boolean tomarSorvete = trabalhoTerca || trabalhoQuinta;
		boolean ficarEmCasa = !trabalhoQuinta && !trabalhoTerca;
		boolean ficouEmCasaComFome = ficarEmCasa;

		System.out.println("Vou comprar uma TV de 50 Polegadas? " + comprouTv50Polegadas);
		System.out.println("Vou comprar uma TV de 32 Polegadas? " + comprouTV32Polegadas);
		System.out.println("Vou tomar sorvete com a família? " + tomarSorvete);
		System.out.println("Familia vai ficar em casa? " + ficarEmCasa);
		System.out.println("Familia ficou em casa com fome? " + ficouEmCasaComFome);

	}
}

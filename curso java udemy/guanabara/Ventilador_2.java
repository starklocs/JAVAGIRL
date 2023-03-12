package guanabara;

public class Ventilador_2 {
	public static void main(String[] args) {
		Ventilador_1 v1 = new Ventilador_1();
		
		v1.cor = "Branco";
		v1.modelo = "Mallory";
		v1.velocidadeMax = 3;
		v1.ligado = true;
		
		v1.status();
		v1.ligar();
		v1.girando();
		
	}
}

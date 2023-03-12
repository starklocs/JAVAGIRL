package guanabara;

public class Ventilador_1 {
	String modelo;
	int velocidadeMax;
	String cor;
	boolean ligado;
	boolean girar;
	
	
	
	void ligar () {
		if (this.ligado == true) {
			System.out.println("Ventilador ligado");
			
		} else {
			System.out.println("Ventilador desligado");
	}
}
	
	void girando () {
		if (this.ligado == true) {
			System.out.println("Ventilador girando.");
		}	else {
			System.out.println("Ventilador não está girando.");
		}
	}
	
	void status () {
		System.out.println("Modelo do ventilador é: "+this.modelo);
		System.out.println("Velocidade máxima é: "+this.velocidadeMax);
	}
}

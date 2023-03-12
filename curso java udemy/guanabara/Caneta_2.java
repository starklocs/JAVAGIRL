package guanabara;
public class Caneta_2 {
	
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC CRISTAL";
		c1.cor = "Azul";
		// c1.ponta = 0.5f;erro por ser private
		c1.carga = 100;
		c1.tampada = true;
		
		c1.status();
	}

}

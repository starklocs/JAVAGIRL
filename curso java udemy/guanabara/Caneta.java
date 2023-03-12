package guanabara;
public class Caneta {
	
		public String modelo;
		public String cor;
		private float ponta;
		protected int carga;
		protected boolean tampada;
		public void rabiscar() {
			if (this.tampada == true) {
				System.out.println("ERRO! Não posso rabiscar.");
			} else {
				System.out.println("Estou rabiscando.");
			}
		}
		
		protected void tampar() {
			this.tampada = true;
		}
		
		protected void destampar () {
			this.tampada = false;
		}
		
		void status() {
		System.out.println("Uma caneta " +this.cor);
		System.out.println("Caneta está tampada? " +this.tampada);
		System.out.println("Carga da caneta está em: "+this.carga+"%");
		System.out.println("Ponta da caneta é: "+this.ponta);
		System.out.println("O modelo da caneta é: "+this.modelo);
		}
		
	}
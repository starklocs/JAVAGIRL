package javagirl;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionário
		//tipos numericos
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos booleano
		boolean estaDeFerias = false;
		
		//tipo caractere
		char status = 'A'; //ativo
		
		//dias de empresa
		
		System.out.println("O funcionário tem "+ anosDeEmpresa * 365 + " dias de empresa.");
		
		//numero de viagens
		System.out.println("O funcionário viajou "+ numeroDeVoos / 2 + " vezes.");
	
		//pontos por real
		System.out.println("O funcionário ganhou "+ pontosAcumulados / vendasAcumuladas + " real por cada venda feita.");
		
		System.out.println("O id " + id + ": ganha -> R$" + salario + " por mês");
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	
	}
}

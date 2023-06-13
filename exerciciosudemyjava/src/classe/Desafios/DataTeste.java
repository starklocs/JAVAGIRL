package classe.Desafios;

public class DataTeste {
	public static void main(String[] args) {
		Data dataEscolhida = new Data();
		
		dataEscolhida.ano = 2023;
		dataEscolhida.mes = 06;
		dataEscolhida.dia = 05;
		
		System.out.printf("Data Escolhida foi: %02d/%02d/%d", dataEscolhida.dia,  dataEscolhida.mes, dataEscolhida.ano);
		
	}
}

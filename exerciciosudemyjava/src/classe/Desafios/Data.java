package classe.Desafios;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	

	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}

}


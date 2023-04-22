package Listas.Pilha;

public class TestePilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(3);
		pilha.empilhar(4);
		pilha.empilhar(5);
		pilha.empilhar(6);
		pilha.empilhar(7);
		pilha.empilhar(8);
		pilha.empilhar(9);
		pilha.empilhar(10);

		pilha.imprimirPilha();

		System.out.println("\n-----------------------\n");

		pilha.desempilhar();
		pilha.desempilhar();
		pilha.desempilhar();
		pilha.imprimirPilha();
	}

}

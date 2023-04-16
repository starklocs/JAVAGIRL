package Listas.Pilha;

public class TestePilha {
	
	    public static void main(String[] args) {
	        Pilha pilha = new Pilha();
	        pilha.empilhar(10);
	        pilha.empilhar(7);
	        pilha.empilhar(90);
	        pilha.imprimirPilha();
	        pilha.desempilhar();
	        pilha.imprimirPilha();
	    }
	
}

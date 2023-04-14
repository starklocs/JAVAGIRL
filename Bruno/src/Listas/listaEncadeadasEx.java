package Listas;

import java.util.LinkedList;

public class listaEncadeadasEx {
	public static void main(String[] args) {

		LinkedList<Integer> lista = new LinkedList<>();

		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(40);

		System.out.println("Lista: " + lista);

		lista.removeFirst();
		System.out.println("Lista após remover o primeiro elemento: " + lista);

		LinkedList<Integer> pilha = new LinkedList<>();
		
		pilha.push(50);
		pilha.push(60);
		pilha.push(70);
		pilha.push(80);

		System.out.println("Pilha: " + pilha);
		pilha.pop(); //remove aqui, o pop, do topo da pilha
		System.out.println("Pilha após remover o elemento do topo: " + pilha);
	}
}

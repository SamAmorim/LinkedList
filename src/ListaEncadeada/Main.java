package ListaEncadeada;

import Lista.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<>();
		
		lista.adicionar(1);
		lista.adicionar(2);
		lista.adicionar(3);
		
		System.out.println(lista);
		lista.limpa();
		System.out.println(lista);
	}
}
package Lista;

// Classe linked list
public class LinkedList<T> {

	private No<T> inicio;
	private No<T> ultimo;

	// definir tamanho da lista
	private int tamanho;

	// adicionar umn nó a lista
	public void adicionar(T elemento) {

		No<T> celula = new No<>(elemento);

		if (this.tamanho == 0) {
			this.inicio = celula;

		} else {
			this.ultimo.setProximo(celula);
		}
		this.ultimo = celula;
		this.tamanho++;
	}
	
	public void limpa() {
		
		for(No<T> atual = this.inicio; atual != null;) {
			No<T>proximo = atual.getProximo();
			atual.setElemento(null);
			atual.setProximo(null);
			atual = proximo;
		}
		
		this.inicio = null;
		this.ultimo = null;
		this.tamanho = 0;
	}
	

	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		if (this.tamanho == 0) {
			return "[]";
		}

		No<T> atual = this.inicio;
		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			builder.append(atual.getElemento()).append(",");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento()).append("]");
		
		/*
		 * while(atual != null) {
			builder.append(atual.getElemento()).append(",");
			 atual = atual.getProximo();
		 * }
		 */
		return builder.toString();
	}

}

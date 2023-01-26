package Lista;

public class No<T> {

	private T elemento;
	private No<T> proximo;
	
	
	//Declaração lista com apenas 1 espaço
	public No(T elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}

	// referencia 
	public No(T elemento, No<T> proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
	}
}

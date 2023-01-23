
## Linked List em JAVA


 - A estrutura de dados *linked list* é um método de armazenar dados dinamicamente em forma de lista, onde cada objeto dentro da estrutura é chamado de nó ou link
 ![exemplo de lista encadeada](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png)
 - Cada nó, possui referências apenas aos seus vizinhos.
 - O ultimo objeto que indica o fim da lista é nulo.

## Estrutura do objeto nó

> A indicação < T > indica que um tipo genérico, que será passado na hora da instanciação

    public  class  No<T> { 
		private  T elemento;
	    private  No<T> proximo; 
	    
	    public  No(T  elemento) {
		    this.elemento =  elemento;
		    this.proximo =  null;
		    }
		public  No(T  elemento,  No<T>  proximo) {
			this.elemento =  elemento;
			this.proximo =  proximo;
			}

> Ambos os construtores dizem respeito as declarações do nó, tendo em vista um construtor que define a posição final *null* e outro que pode define a referência ao próximo elemento
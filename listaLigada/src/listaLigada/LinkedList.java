package listaLigada;

public class LinkedList {
	private Node header; // início da lista ligada
	private Node trailer; // final da lista ligada
	private int size; // quantidade de elementos na lista ligada

	public LinkedList() {
// inicializa a lista como vazia
		header = null;
		trailer = null;
		size = 0;
	}

	public int size() {
// retorna o tamanho da lista
		return size;
	}

	public boolean isEmpty() {
// verifica se a lista está vazia
		if (size == 0)
			return true;
		else
			return false;
	}

	public Node first() {
// retorna o Nó inicial da lista
		return header;
	}

	public Node last() {
// retorna o último Nó da lista
		return trailer;
	}

	public void addFirst(Node novo) {
		// adiciona um novo nó no inicio da lista
		if (isEmpty()) {
			header = novo;
			trailer = novo;
		} else {
			novo.setNext(header);
			header = novo;
		}
		size++;
	}

	public void addLast(Node novo) {
		//adiciona um novo nó no final da lista
		if (isEmpty()) {
			header = novo;
			trailer = novo;
	}else{
			trailer.setNext(novo);
			trailer = novo;
		}
	}
	
	//arrumar
	public void mostraLista(){
		Node aux = header;
		aux.mostraAnimal();
		while (aux.setNext != null) {
			aux = aux.getNext();
			aux.mostraAnimal();
		}
		System.out.println("FIM DA LISTA!");
	}
}
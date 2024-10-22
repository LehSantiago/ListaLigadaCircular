package listaLigada;

public class Node {
	private String nomeAnimal; // elemento armazenado no nó
	private Node next; // próximo elemento da lista

	public Node(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
		this.next = null;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
		
	}

	public void setnomeAnimal(String nomeAnimal) {
// Altera elemento armazenado no nó
		this.nomeAnimal = nomeAnimal;
	}

	public Node getNext() {
// Devolve o próximo elemento do nó
		return next;
	}

	public void setNext(Node no) {
// Altera o apontador next do nó para um novo nó n
		this.next = no;
	}

}
package listaLigada;

public class ProjLigada {
	public static void main(String[] args) {
		LinkedList zoo = new LinkedList();
		
		Node n1 = new Node ("CACHORRINHO");
		zoo.addFirst(n1);
		zoo.addFirst(new Node ("GATO"));
		zoo.addFirst(new Node ("LEÃO"));
		zoo.addLast(new Node ("JACARÉ"));
		zoo.addLast(new Node ("LOBO"));
	}
}

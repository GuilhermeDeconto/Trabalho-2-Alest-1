
/*
 * Autores : Guilherme Deconto e Gustavo Possebon
 */

public class Node {
	private String element;
	private Node next = null;
	
	public Node(String element) {
		this.element = element;
	}
	
	public String getElement() {
		return element;
	}
	
	public void setElement(String element) {
		this.element = element;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}

import java.util.ArrayList;

/*
* Autores : Guilherme Deconto e Gustavo Possebon
*/

public class Pilha {
	private ArrayList<Node> pilha;
	private Node head;
	private int count = 0;
	private int tamanhoMaximoAtingido = 0;
	
	public Pilha() {
		pilha = new ArrayList<Node>();
	}
	
	public void push(String valor) {
		Node novoElemento = new Node(valor);
		if(count > 0)
			novoElemento.setNext(head);
		pilha.add(novoElemento);
		head = novoElemento;
		count++;
		
		atualizaTamanhoMaximoAtingido();
	}

	public int atualizaTamanhoMaximoAtingido() {
		if(count > tamanhoMaximoAtingido)
			tamanhoMaximoAtingido = count;
		return tamanhoMaximoAtingido;
	}
	
	public int getTamanhoMaximoAtingido() {
		return tamanhoMaximoAtingido;
	}
	
	public int size() {
		return count;
	}

	public String pop() {
		String valor = head.getElement();
		head = head.getNext();
		count--;
		pilha.remove(pilha.size() - 1);
		return valor;
	}

	public String top() {
		return head.getElement();
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public void clear() {
		pilha.clear();
		count = 0;
		head = null;
	}
	
	public String toString() {
		StringBuilder saida = new StringBuilder();
		Pilha reverseQueue = new Pilha();
		
		Node aux = head;
		while (aux != null) {
			reverseQueue.push(aux.getElement());
			aux = aux.getNext();
		}
		
		while (reverseQueue.count > 0)
			saida.append(reverseQueue.pop());
		
		return saida.toString();
	}
}

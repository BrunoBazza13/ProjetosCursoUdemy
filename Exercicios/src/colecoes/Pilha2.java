package colecoes;

public class Pilha2 {

	private final int[] pilha;
	private final int inicio;
	private int topo;

	Pilha2() {

		pilha = new int[3];
		inicio = 0;
		topo = 0;

	}

	
	public boolean isFull() {

		return (topo == pilha.length);

	}

	public boolean isEmpty() {

		return (inicio == topo);

	}

	public void push(int x) {

		if (!isFull()) {
			pilha[topo++] = x;
	
		} else {
			System.out.println("Pilha esta cheia");
		}

	}

	// metodo remove e mostra o elemento e mostra 
	public int pop() {

		int aux;

		if (!isEmpty()) {
			 aux = pilha[topo - 1];  // topo anterior 
			 topo --; // novo topo
			 return aux;
		
		} else {
			
			System.out.println("Pilha esta vazia");
			return -1;
		}

	}

	// retorna o elemento do topo
	public int peek() {
		
		if(!isEmpty()){
			return pilha[topo - 1]; // topo da pilha 
			
		}else {
			System.out.println("Pilha esta vazia");
			return -1;
		}
	}
	
	
}

package colecoes;

public class Principal_Pilha {

	public static void main(String[] args) {
		
		
	//	int dados[] = new int[3];		
	
		
		Pilha2 pilha = new Pilha2();
		
		
		pilha.push(10); // adiciona valores a pilha
		pilha.push(100);
		pilha.push(5);		
		pilha.push(1);
		
		System.out.println(pilha.peek()); // mostra o topo da pilha 
		System.out.println(pilha.pop()); // remove o topo da pilha
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.peek());
	
	}
	
}

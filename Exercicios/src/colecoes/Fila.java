package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		// na fila o primeiro a entrar é o primeiro a sair
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e add ambos adicionam elementos na fila
		// a diferencça é o comportamento quando a fila esta cheia 
		
		fila.add("Bruno"); // no caso do add retorna false 
		fila.offer("Livia"); // no caso do offer retorna uma exceção
		fila.add("Andressa");
		fila.offer("Alexandro");
		fila.add("Mariana");
		
		// peek e element obtem o  primeiro elemento da fila sem remover
		// a diferença é no comportamento 
		
		System.out.println(fila.peek()); // no peek retorna null
		System.out.println(fila.element()); // no element retorna um erro
		
		//poll obtem o primeiro elemento removendo da fila
		System.out.println(fila.poll()); // e retorna null se a fila estiver vazia
		
		// remove obtem o proximo elemnto removendo da fila
		System.out.println(fila.remove());// e retorna um erro se a fila estiver vazia
		
		System.out.println(fila.peek()); // retorna sem remover 
		
		System.out.println(fila.poll()); //retorna e remove
		
		System.out.println(fila.peek());
		
		
		
		
		
		
	}
}

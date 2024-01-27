package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		
		SortedSet<String> lista = new TreeSet<>();// Quando o tipo da varial de um conjunto esta dentro de uma chave <...>(operador diamond)
						                          // o conjunto só poderar receber valores daquele tipo assim estando amarrado
												 // TreSet é um obj que imprime de forma ordenada
		lista.add("Bruno");
		lista.add("Mariana");
		lista.add("Liviaa");
		lista.add("Modi");
		
		for(String nome: lista) {
			System.out.println(nome);
			
		}
		
		
		for(int i = 0; i < 1; i++) {
			System.out.println(lista);
		}
		
					
		Set<Integer> num = new HashSet<>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		
		for(int numeros: num) {
			System.out.println(numeros);
		}
		
		for(int i = 0; i < 1; i++) {
			System.out.println(num);
		}
	}
}

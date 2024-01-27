package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		
		// O set por padrao não é ordenado
		// não indexado, não  é possivel acessar valores pelo indice
		// não aceita repetição
		
		HashSet  conjunto = new HashSet();
		
		// uma collection nao suporta tipos primitivos, mas automaticamente ele converte para sua classe
		
		conjunto.add(1.2); // doouble -> Double 
		conjunto.add(2); // int -> Integer
		conjunto.add("Texto"); 
		conjunto.add(true); // boolean -> Boolean
		conjunto.add('x'); //char -> Character 
		
		
		System.out.println(conjunto.size()); // size é um metodo de colletion que mostra quantos valores tem 
		
		conjunto.add('x');
		conjunto.add("Texto");
		
		System.out.println(conjunto.size()); // o valor vai ser o mesmo pois no set não adiciona valores repetidos
		
		
		

		
		System.out.println(conjunto.remove('x')); // o metodo remove ele retorna true quando algum valor e removido se o valor não 
													//existir retorna false
		
		System.out.println(conjunto.remove("texto"));
	
	
		System.out.println(conjunto.contains('x')); // o metodo contains ele retorna true quando algum valor esta contido no conjunto e
													// retorna false se nçao estiver
		
		System.out.println(conjunto.contains("Texto"));
		
		Set nuns = new HashSet();
		
		nuns.add(10);
		nuns.add(20);
		nuns.add(30);
		
		System.out.println(nuns);
		System.out.println(conjunto);
		
		conjunto.addAll(nuns); // união entre dois conjuntos
		
		
	
	}
	
}

package lambdas;


import java.util.Arrays;
import java.util.List;

public class Foreach {

	
	public static void main(String[] args) {
		
		
		List<String> aprovados =  Arrays.asList("Bru", "Liv", "And");
		
		//forma tradicional
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		//lambda
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!"); });  // para cada elemento da lista ele executa esta função
		
		//Method reference
		aprovados.forEach(System.out::print); // passa uma referencia para essa função, percorre a lista e chama o println de forma que percorra a lista e imprima o valor
		
	}
	
}

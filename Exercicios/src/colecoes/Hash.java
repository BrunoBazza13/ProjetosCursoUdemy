package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		
		HashSet<Usuario> usuario = new HashSet<>();
		
		usuario.add(new Usuario("Bruno"));
		usuario.add(new Usuario("Livia"));
		usuario.add(new Usuario("Andressa"));
		
		HashSet<Integer> num = new HashSet<>();
		
		num.add(10);
		
		
		boolean verifica = usuario.contains(new Usuario("Bruno")); // para a comparação entre obj fuincionar é necessario que 
																 // tanto o hashcode quanto o equals estejam trabalhando juntos 
																  // pois mesmo o valor estando presente ele pode retornar falso
																
		System.out.println(verifica); 
		System.out.println(num.contains(10));// por ser uma atribuição por valor retona true 
		
	}
	
}

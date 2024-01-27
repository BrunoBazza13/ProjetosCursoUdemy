package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		// LIst pode ser heterogenio ( aceita valores diferentes )
		// pode ser homogenio ( aceita so msm valores )
		// aceita obj duplicados
		// é ordenada
		// é indexado(da para acessar elementos apartir do indice)
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario usuario = new Usuario("Bruno"); // criei um usuario
		
		lista.add(usuario); // adicionei um usuario na lista
		
		lista.add(new Usuario("Livia")); // criei e ja adicionei um usuario;
		lista.add(new Usuario("Mariana"));
		lista.add(new Usuario("Alexandro"));
		lista.add(new Usuario("Andressa"));
		
		System.out.println(lista.get(4)); // acessa pelo indice
		
		System.out.println("nome removido" + lista.remove(1)); // remover pelo indice ele retorna o Usuario 
		System.out.println(lista.remove(new Usuario("Andressa"))); // remover pelo obj retorna tru ou false 
		
		System.out.println( "Tem elemento" + lista.contains(new Usuario("Mariana"))); // retorna true ou false 
		
						
		for(Usuario n: lista) {
			System.out.println(n.nome);
			
		}
	
	
	}
	
	
}

package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		// O map é uma estrutura chave valor
		// A chave não aceita repetição
		// valor aceira repetição

		Map<Integer, String> usuario = new HashMap<>();

		usuario.put(1, "Bruno"); // metodo put tanto adiciona quanto altera o valor e se a chave for a msm
		usuario.put(2, "Livia"); // o valor de bruno sera alterado para livia
		usuario.put(3, "Alemao");
		usuario.put(4, "Andressa");
		usuario.put(5, "Bazza");

		System.out.println(usuario.values());// retorna os valores do conjunto

		System.out.println(usuario.isEmpty()); // metodo retorna se o conjuto esta vazio ou nao com true ou false
		System.out.println(usuario.keySet()); // conjunto das chaves
		System.out.println(usuario.size()); // metodo que mostra o tamanho do conjunto
		System.out.println(usuario.entrySet());// nete metodo ele mostra a chave e o valor ao mesmo tempo

		// percorre as chaves e imprime o valor das chaves
		for (int chaves : usuario.keySet()) {
			System.out.println(chaves);
		}

		// percorre o valor e imprime os valores
		for (String valor : usuario.values()) {
			System.out.println(valor);
		}

		for (Entry<Integer, String> registro : usuario.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}

	}
}

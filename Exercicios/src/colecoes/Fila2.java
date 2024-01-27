package colecoes;

public class Fila2 {

	private final int [] dados;
	private int inicio;
	private int fim;
	private int capacidade;
	
	Fila2() {
		
		dados = new int [10];
		inicio = 0;
		fim = 0;
		capacidade = 0;
		
	}
	
	public boolean estaVazia() {
		
		return capacidade == 0;
	}
	
	public boolean estaCheia() {
		
		return capacidade == dados.length;
	}

	// este metodo faz com que n atinja o limite da fila
	public void incluir(int elemento) {
		
		dados[fim] = elemento; // adiciona o elemento de acordo com o indice percorrido
		fim = (fim + 1) % dados.length;
		capacidade++;
		
	}

	public int remover() {
		
		if(estaVazia()) {
			throw new RuntimeException("Fila Vazia");
		}
		
		int elemento = dados[inicio]; //remove o elemento de acordo com o indice percorrido, indicado pela variavel inicio
		inicio = (inicio + 1) % dados.length;
		capacidade--;
		return elemento;
		
	}

}

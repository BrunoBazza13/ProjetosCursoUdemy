package classe;

public class Produto {

	String nome;
	double preco;
	static  double desconto = 0.25;
	
	// Construtor implicito, nao precisa informa nenhum valor no parametro para inicializar o obj
	Produto(){
		
		
	}
	
	// Construtor explicito, precisa informar no paramtro os valores para inicializar o obj
	Produto(String nomeInicial, Double precoInicial){
		
		nome = nomeInicial;
		preco = precoInicial;              
	//	desconto = descontoInicial;
		
	}
	
	
	double precoComDesconto(){
		
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente ) {
		
		return preco * (1 - desconto + descontoDoGerente);
	}
	
	
	
}

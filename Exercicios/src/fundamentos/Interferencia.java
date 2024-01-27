package fundamentos;

public class Interferencia {

	public static void main(String[] args) {
		
		
		// var ele infere o tipo  da variavel de acordo com o valor inserido
	
		var b = 4.55; // declaração e inicialização
		System.out.println(b);
		
		
		// o ecplipse sabe  que "texto" e do tipo String
	
		var c = "texto"; // declaração e inicialização
		System.out.println(c);
		
		
		c = "outro texto";  // inicialização
		System.out.println(c);
		
		
		// em  var nao podemos declarar e depois inicializar deve ser feito a declaração e a inicializaçao em uma unica linha
    
		//	var d;
		// d = 123.5;
		
		
		// nao podemos tbm inserir valores diferentes da primeira inicialização
		
		var e = 12;
		// e = 12.1;
		System.out.println(e);
		
	}
	
	
}

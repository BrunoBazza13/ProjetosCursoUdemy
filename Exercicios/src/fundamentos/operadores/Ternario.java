package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.6;
		
		
		// operador ternaio recurso usado para tomada de decisão
		String resultado = media >= 6.0 ? "Aprovado" : "Recuperação"; // atribuiçao condicional, se o resultado for true mostra a a primeira opcao 
																		// se for false mostra a segunda
		System.out.println("O aluno esta " +resultado);
	}
	
}

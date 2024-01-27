package lambdas;



public class CalculoTeste2 {

	public static void main(String[] args) {

		// para atribuir uma lambda em uma variavel ela tem que bater com o tipo de retorno e as quantidades de parametros
		
		Calculo calculo = (a, b) -> { // lambdas funções associadas a uma variavel com par de chaves
			return a + b;
		};
		
		
		
		System.out.println(calculo.executar(10, 4));

		 calculo = (a, b) -> a * b; // lambdas sem par de chaves dessa forma não precisamos colocar o return ja esta de forma implicita
		 System.out.println(calculo.executar(10, 4));
		 
		 
		 
		 
		 
		 System.out.println( calculo.legal());
		 
		 System.out.println(Calculo.muitoLegal());
		 
	}

}

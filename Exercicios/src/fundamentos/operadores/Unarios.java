package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // operador unario pós fixado, desempenha uma ação com um unico operando ou seja sozinho
		a--; 
		
		++b; // operador unario pré fixado
		--b;
		
		System.out.println(a);
		System.out.println(b);
	
		System.out.println("mini desafio ");
		System.out.println(++a == b--); // a atribuico pre-fixada é feita primeiro logo apos a comparacao e depoi e feita o decremento pois esta pos-fixado
		System.out.println(a == b);
	
	}
	
	
}

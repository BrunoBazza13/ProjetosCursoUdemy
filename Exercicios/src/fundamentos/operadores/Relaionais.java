package fundamentos.operadores;

public class Relaionais {

	public static void main(String[] args) {
		
		
		int a = 97;
		int b = 'a'; 
		
		System.out.println(a == b); // comparação
		System.out.println(30 != 7); // diferença
		System.out.println(3 > 4); // maior que 
		System.out.println(3 >= 3); // maior igual 
		System.out.println(3 < 7); // menor que
		System.out.println(30 <= 7); // menor igual
	
	double nota = 9.9;
	boolean bomComportamento = true;
	boolean passouPorMedia = nota >= 7;
	boolean temDesconto = bomComportamento && passouPorMedia;
	
	System.out.println(temDesconto);
	
	}
	
	
}

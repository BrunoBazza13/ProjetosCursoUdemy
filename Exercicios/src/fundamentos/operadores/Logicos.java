package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // so da true se ambas forem v
		System.out.println(condicao1 || condicao2); // da vervaddeiro se pelo meno uma for v
		System.out.println(condicao1 ^ condicao2); //  ou exclusivo resulta verdadeiro se os valores de entrada forem diferentes
		System.out.println(!condicao1 ); // not ele troca o resultado
		System.out.println(!!condicao2); // not troca o resultado duas vezes 
	
	
		System.out.println("Tabela verdade E(AND)");
		System.out.println(true && true );
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false );

		System.out.println("Tabela verdade OU(OUR)");
//		System.out.println(true || true );
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false ||false );
		
		System.out.println("Tabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true );
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false );
		
	
		System.out.println("Tabela verdade NOT");
		System.out.println(!true  );
		System.out.println(!false );
		
	}
	
	
}

package fundamentos.operadores;

import java.util.Scanner;

public class TipoSreingEquals {

	public static void main(String[] args) {
		
	
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		
		System.out.println("2" == s1);// mesmo sendo o mesmo valor a comparação deu false, por isso devemo usar o equals quando for
									 // comparar uma string
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		
		// String por boa pratica sempre se compara com equlas
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
	}
	
	
}

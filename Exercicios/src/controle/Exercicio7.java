package controle;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite uma palavra");
		String valor = entrada.next();
		
		char vet [] = valor.toCharArray();
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
	}
	
}

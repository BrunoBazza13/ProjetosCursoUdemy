package fundamentos;

import java.util.Scanner;

public class Console {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.print("\nDigite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();// captura o espaco em vazio depois de digitar o numero inteiro
		
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("\nDigite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		
		System.out.printf(" nome: %s\n sobrenome: %s\n idade: %d", nome, sobrenome, idade);
		
		System.out.printf(" %s %s tem %d");
		
		
		entrada.close();
		
		
	}
	
}

package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite a nota");
		double nota = entrada.nextDouble();
		
		
		if(nota <= 0 && nota > 10) {
			System.out.println("nota invalida");
		
		}else if(nota >= 9) {
			System.out.println("Conceito A");
		
		}else if(nota >=7 ) {
			System.out.println("Conceito B");
	
		}else if(nota >= 6) {
			System.out.println("Conceito C");
		
		}else if(nota >= 4) {
			System.out.println("Conceito D");
			
		}else {
			System.out.println("Conceito E");
		}
		
		
		
	}
	
}

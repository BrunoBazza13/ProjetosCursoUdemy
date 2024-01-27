package controle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe um numero");
		int num = entrada.nextInt();
		
		
		
		if(num >= 0 && num <= 10) {
	
			if(num % 2 == 0) {
				System.out.printf(" O numero %d esta entre 0 e 10 e é par", num);
			
			}else if (num % 2 == 1){
				System.out.printf(" O numero esta entre 0 e 10 mas naão é par", num);
			
			}
		}else {
			System.out.println(" O numero nao esta entre 0 e 10");
		}
		
	}
	
	
}

package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	int tentativas;
	int numSorteado;
	int numero;
		
		String valor;
		do {
			System.out.println("Sorteando um numero entre 0 a 100");
			
			Random numeroAleatorio = new Random();
			numSorteado = numeroAleatorio.nextInt(100);
			
			System.out.println("Começou o jogo, vamos la");
			tentativas = 0;
			
			
			do {
				
				tentativas++;
			
				System.out.printf("\nTetnativa %d: ", tentativas);
				numero = entrada.nextInt();
				
				if(numero > numSorteado) {
					System.out.printf("O nuero sorteado e menor que %d\n", numero);
				
				}else if(numero < numSorteado) {
					System.out.printf("O numero sorteado é maior que %d\n", numero);
					
				}else {
					System.out.printf("parabens voce acertou com apenas %d tentativas\n", tentativas);
				break;
				}
				
				
			}while(tentativas != 10);
			
			
			System.out.println("\nDigite sair para sair do programa ou qualquer valor para continuar");
			 valor = entrada.next();
			
		}while(!valor.equalsIgnoreCase("sair"));
		
		
	}
	
}

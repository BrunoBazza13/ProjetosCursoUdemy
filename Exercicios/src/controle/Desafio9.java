package controle;

import java.util.Scanner;

public class Desafio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int maior = 0;
		int menor = 0;
		int num = 0;
		int i;

		for (i = 0; i <= 5; i++) {
			System.out.printf("Informe o %d valor: ", 1 + i);
			num = entrada.nextInt();

			if (num > maior) {
				maior = num;
			
			}

		}

		System.out.println("O maior numero é: " + maior);
		System.out.println("O menor numero é: " + menor);

		entrada.close();
		
	}

}

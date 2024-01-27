package controle;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double total = 0;
		int contador = 0;

		for(int i = 1; i <= 2; i++) {
			System.out.printf("Informe a %d nota: ", i);
			nota = entrada.nextDouble();
			nota += nota;
		}

		
		double media = nota / 2;

		if (media >= 7.0) {
			System.out.println("Sua media foi " + media + " e voce esta aprovado");

		} else if (media > 4.0 && nota < 7.0) {
			System.out.println("Sua media foi " + media + " e voce esta de recuperacao");

		} else  {
			System.out.println("Sua media foi " + media + " e voce esta reprovado");

		}
	}

}

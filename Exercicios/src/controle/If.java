package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a media do aluno ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado ");
		}

		if (media >= 5.0 && media < 7 ) {
			System.out.println("Recuperação");
		}

		
		
		boolean criterioReprovacao = media >= 0 && media <= 4; 
		
		if (criterioReprovacao) {
			System.out.println("Reprovado");
		}

	}

}

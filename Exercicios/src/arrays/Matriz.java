package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos");
		int qntdAlunos = entrada.nextInt(); // aqui temos o tamanho da matriz
		
		System.out.println("Informe a quantidade de nota por aluno");
		int qntdNotas = entrada.nextInt(); // e aqui temos o valor por matriz uma matriz dentro da outra 
		
		double notaDaTurma[][] = new double [qntdAlunos][qntdNotas]; // aqui foi criado uma matriz
		
		double total = 0;
		for(int i = 0; i < notaDaTurma.length; i++) {
			
			for(int j = 0; j < notaDaTurma[i].length; j++) {
						
				System.out.printf("Informe a %d nota do %d aluno: ", (j + 1), (i + 1));
				notaDaTurma[i][j] = entrada.nextDouble();
				total += notaDaTurma[i][j]; 
			}
		}
		
		System.out.println("Total das notas é: " + total);
		
		double media = total / (qntdNotas * qntdAlunos);
		System.out.println("A média da sala é: " + media);
	
		entrada.close();
	
		for(double notasDoAluno[]: notaDaTurma){
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
	}
	
	
}

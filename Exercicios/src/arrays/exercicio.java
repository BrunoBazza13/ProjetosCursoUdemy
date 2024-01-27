package arrays;

import java.util.Arrays;

public class exercicio {

	public static void main(String[] args) {
		
		// vetor/ array armazena valores do mesmo tipo
		// são homogenios
		// vetores tem um valor fixo
		// para iniciar um vetor precisa informar seu tamanho
		
		double notaAlunoA[] = new double[4];// iniciando um vetor com seu tipo e tamanho
		
		// inserindo valores no vetor
		notaAlunoA[0] = 8;
		notaAlunoA[1] = 6.5;
		notaAlunoA[2] = 7.8;
		notaAlunoA[3] = 10;
		
	
		System.out.println(Arrays.toString(notaAlunoA)); // imprimindo valores
		
		
		double totaAlunoA = 0;
		for (int i = 0; i < notaAlunoA.length; i++) {
			totaAlunoA += notaAlunoA[i];
		}
		
		System.out.println(totaAlunoA );
		
		// outra forma e inicializar
		double notaAlunoB [ ]= {5.5, 7.5, 10, 8}; 
		
		double totalAlunoB = 0;
		for (int i = 0; i < notaAlunoB.length; i++) {
			totalAlunoB += notaAlunoB[i];
		}
		
		System.out.println(Arrays.toString(notaAlunoB));
		
		System.out.println(totalAlunoB);
	}
	
}

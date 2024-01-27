package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String  valor = "";
		
		do {
			
			System.out.println("Digite sair para sair do programa");
			valor = entrada.nextLine();
			
		}while(!valor.equalsIgnoreCase("sair"));
		
		entrada.close();
		
	}
	
	
}

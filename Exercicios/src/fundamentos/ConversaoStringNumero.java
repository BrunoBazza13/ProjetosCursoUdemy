package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro numero");
		double num1 = Double.parseDouble(valor1); // conversao de um texto para double
		
		
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo numero");
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2;  // soma das duas conversões para double
		
		System.out.println("A soma dos valores são: " + soma);
		
		
		
		
	}
	
	
}

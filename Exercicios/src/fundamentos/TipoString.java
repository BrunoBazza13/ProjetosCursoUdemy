package fundamentos;

public class TipoString {

	
	public static void main(String[] args) {
		
	String s = " Boa Tarde";
	
	
	System.out.println(s.concat("!!!")); // esta concatenando 
	
	System.out.println(s + " !!!");
	
	System.out.println(s.startsWith("boa")); // metodo verifica se a primeira palavra digita sao iguais
	
	System.out.println(s.toUpperCase().endsWith("TARDE")); // metodo verifica se a ultima palavra digita sao iguais
		
	var nome = "Bruno";
	var sobrenome = "Bazza";
	var idade = 20;
	var salario = 5_000.00;
	
	System.out.println("nome: " + nome + "\nsobrenome: " + sobrenome + "\nidade: " +idade
			+"\nsalrio: " + salario);
	
	System.out.printf("%s %s tem %d e recebe %.2f\n", nome, sobrenome, idade, salario);
	
	
	String frase = String.format("%s %s tem %d e recebe %.2f", nome, sobrenome, idade, salario);
	
	System.out.println(frase);
	
	}
	
	
}

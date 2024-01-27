package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String x = "Bom Dia x";
		
		x =	x.replace("x", "senhora");// troca a variavel digitada por outra
		x = x.toUpperCase();
	
		System.out.println(x);
		
		
		String s = "Bruno".toUpperCase();
		
		System.out.println(s);
		
		// troca a variavel que o usuario digitar pela a q ele informa
		String y = "Bom dia x".replace("x", "Bruno").toUpperCase().concat("!!!");
		
		System.out.println(y);
	
	}

}

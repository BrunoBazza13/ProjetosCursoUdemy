package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b;//9   c = c + b; 
		c -= b;//6  c = c -b; 
		c *= b;//18 c = c * b 
		c /= b;//6 c = c / b 
		
		System.out.println(c);
		 
		c %= b;  //c = c % b resto da divisão
		
		System.out.println(c);
		
	}
	
	
}

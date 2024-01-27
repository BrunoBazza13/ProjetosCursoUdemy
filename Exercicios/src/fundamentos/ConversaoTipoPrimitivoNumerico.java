package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		
		double a = 1; // conversao implicita, onde nao precisa informa o tipo
		System.out.println(a);
		
		float b = (float) 1.12345678888;  // conversao explicita
		System.out.println(b);
		
		int i = 500; 
		
		byte c = (byte) i ;  // conversao explicita
		System.out.println(c);
		
		
		
		double e = 1.999999;
		int f = (int) e; // conversao explicita
		System.out.println(f);
	}
	
}

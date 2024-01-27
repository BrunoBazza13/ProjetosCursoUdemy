package fundamentos;

public class ConversaoNumeroSreing {

	
	public static void main(String[] args) {
		
		// Integer e uma classe do tipo primitivo
		
		// pode fazer esta conversão tanto declarando variavel do tipo Wapper e usando o metodo toString sem parametro 
		// ou declarar uma variavel de um tipo e passar como parametro
		
		Integer num1 = 1000;
		num1.toString();
		System.out.println(num1);// conversao de um numero para String virando texto
		
		//ou
		
		Integer num2 = 2000;
		System.out.println(num2.toString());
	
		
		
		int mum2 = 10000;
		System.out.println(Integer.toString(mum2));
		
		
		
	}
	
	
	
}

package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		
		// informações do funcionario
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 543;
		int id = 56789;
		long pontosAcumulados  = 3_134_845_223l;  // quando informamos um valor literal e ele passa da capacidade do inteiro precisa informar
												  // com L ou l para dizer q este valor e long
		
		// tipos numéricos reais 
		float salario = 11_445.44F; // java nao analiza o valor e sim o tipo  por isso precisamos informar que e do tipo float 
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = true;
		
		// tipo caractere
		char status = 'A';
		 
	//	char  statu = '\u0010';	
		
		
		
		
		// dias da empresa 
		System.out.println(anosDeEmpresa * 365);
		
		//numeros de voos
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.printf("%d: gamha -> %.2f", id, salario);
		
		System.out.println("ferias? " + estaDeFerias);
		
		
		System.out.println("status: " + status);
		
		
		
		
	}
	
	
	
}

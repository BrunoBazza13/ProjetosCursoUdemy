package classe;



public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor onde uma copia do valor é definida na memoria		
		
		a++;
		b--;
		
		System.out.println(a + " " + b); // os valore são independentes
		
		
	//quando um objeto é criado, um espaço é alocado na memoria do computador
	// tendo um endereço que aponta para uma area de memoria onde de fato esta os valores
	// entao quando tem uma atriubuição por referencia ambas variaveis tem o mesmo endereco de memoria
		
	Data d1 = new Data();
	Data d2 = d1; // atribuição por referencia(objeto) apontam para a mesme referencia
	
	d1.dia = 13;
	d2.mes = 8;
	d1.ano = 2002;
	
	// ao atribuir os valores tanto em d1 quanto em d2 ao imprimir os valores de d1 e d2 irão ter a mesma resposta
	
	System.out.println(d1.obterDataForatada());
	System.out.println(d2.obterDataForatada());
		
		voltarParaValorPadrao(d2);

	System.out.println(d1.obterDataForatada());
	System.out.println(d2.obterDataForatada());
	
	Data d3 = new Data();
	double total = d3.soma(10);	
	
	System.out.println(total);
	}
	
	
	
	
	static void voltarParaValorPadrao(Data d) {
		d.dia = 1;			// isto não é boa pratica so para estudos
		d.mes = 1;
		d.ano = 1970;
		
		
	}
	
	
}

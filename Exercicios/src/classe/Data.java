package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	
	Data(){
		
		dia = 1;
		mes = 1;
		ano = 1970;
		
	}
	
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	
	
	String obterDataForatada() {

		String dataFormatada = String.format("%d/%d/%d", dia, mes, ano); // este metodo tem flexibiidade em diversas operações

		return dataFormatada;

	}

	void imprimeDataFormatada() {
		
		System.out.printf("%d/%d/%d", dia, mes, ano);  // este metodo eesta amarrado a imprimir o resultado no terminal do sistema
		
	}
	
	
	double soma(double a) {
		return a++;
	}
	
	
}

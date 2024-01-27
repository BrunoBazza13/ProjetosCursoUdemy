package classe;

public class AreaCircunferencia {

// static é um metodo que faz com que o atributo seja da classe e nao das instancias/ objestos,  
//	de uma forma que nao precisa instanciar a classe para atribuir um valor 
// assim nao teremos varias copias do atributo e apenas um que é o da classe
	
	static final double PI = 3.14;
	 double raio;
	
	AreaCircunferencia(double raioInInicial) {
		raio = raioInInicial;
		
	}
	
	 double calculaAreaCirc() {
		
		return PI * Math.pow(raio, 2);				
		
	}
	
}

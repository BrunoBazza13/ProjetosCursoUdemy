package lambdas;


@FunctionalInterface //uma interface funcional so pode conter apenas um unico metodo
public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		
		return "Funciona";
		
	}
	
	static String muitoLegal() {
		
		return "funciona tambem";
		
	}
	
}

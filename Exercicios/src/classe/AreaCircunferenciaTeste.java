package classe;

public class AreaCircunferenciaTeste {

	public static void main(String[] args) {
		
		AreaCircunferencia aC = new AreaCircunferencia(10);
		
		double resultado = aC.calculaAreaCirc();
		
		//double total = aC.PI * 4;
		
		double total = AreaCircunferencia.PI * 4; // forma correta
		
		;
		
		System.out.println(total);
		
		System.out.println(Math.pow(3, 2));
		
		System.out.println(resultado);
		
	}
	
	
}

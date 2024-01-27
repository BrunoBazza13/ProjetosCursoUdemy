package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator<Double> calc = (a, b) -> {	return a + b; };

		double total = calc.apply(10.0, 10.0);
		
		
		System.out.println(total);
		
	
	}

}

package lambdas;

public class TesteCalculo1 {

	public static void main(String[] args) {

		Calculo calculo = new Soma();
		System.out.println(calculo.executar(10, 10));

		calculo = new Multiplicacao();
		System.out.println(calculo.executar(10, 10));
		

	}

}

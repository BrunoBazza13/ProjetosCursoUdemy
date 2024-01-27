package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro carro = new Carro();

		System.out.println(carro.ligado());

		carro.ligar();
		System.out.println(carro.ligado());

		System.out.println(carro.motor.giros());

		carro.acelerar();
		carro.acelerar();
		carro.acelerar();

		System.out.println(carro.motor.giros()); 

	}

}

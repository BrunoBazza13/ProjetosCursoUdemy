package oo.composicao;

public class Carro {

//	Motor motor;
//	
//	Carro(){
//		this.motor =  new Motor(this);
//		
//	}
	
	Motor motor = new Motor(this);
	
	void acelerar() {
		
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		
		motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		
		motor.ligado = true;
	}

	boolean ligado() {
		
		return motor.ligado;
	}


}

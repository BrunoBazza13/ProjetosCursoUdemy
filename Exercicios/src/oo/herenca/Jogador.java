package oo.herenca;

public class Jogador {

	int vida = 100;
	int x;
	int y;

	
	Jogador(int x, int y){
		this.x = x;
		this.y = y;			// quando criado um construtor explicito as subclasses precisam chamar este construtor assim 
							//criando outos construtores com a chamada super(...) e passando seus parametros certos.
		
			
	}
	
	
	
	boolean atacar(Jogador oponente) {

		int diferencaX = Math.abs(x - oponente.x);
		int diferencaY = Math.abs(y - oponente.y);

		if (diferencaX == 0 && diferencaY == 1) {
			oponente.vida -= 10;
			return true;

		} else if (diferencaY == 0 && diferencaX == 1) {
			oponente.vida -= 10;
			return true;

		} else {
			return false;
		}

	}

	boolean andar(Direcao direcao) {

		switch (direcao) {

		case NORTE:
			y--;
			break;

		case LESTE:
			x++;
			break;

		case OESTE:
			x--;
			break;

		case SUL:
			y--;
			break;

		}

		return true;
	}

}

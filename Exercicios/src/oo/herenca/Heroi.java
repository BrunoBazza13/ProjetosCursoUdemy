package oo.herenca;

public class Heroi extends Jogador {

	Heroi(int x, int y) {
		super(x, y);

	}

	Heroi() {
		super(10, 10);

	}

	boolean atacar(Jogador oponente) {

		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);

		return ataque2 || ataque1;

	}

}

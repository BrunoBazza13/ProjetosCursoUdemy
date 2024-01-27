package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcesso() {

		Ana sogra = new Ana();

		//System.out.println(sogra.segredo);  por ser privado so a classe ana tem acesso
		// System.out.println(sogra.facoDentroDeCasa); por ser de pacote diferente so o outro pacote tem acesso
		//System.out.println(sogra.formaDeFalar); 
		System.out.println(sogra.todosSabem);

	}

}

package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	
void testeAcesso() {
		
		//Ana mae = new Ana();
		
		
	//	System.out.println(mae.segredo);  por ser privado so a classe ana tem acesso
	//	System.out.println(mae.facoDentroDeCasa);  por ser de pacote diferente so o outro pacote tem acesso
		System.out.println(formaDeFalar);	// nao preciso instanciar para ter aceso a este atributo se instaniar da erro
		System.out.println(todosSabem);
		
		
		
		
		
	}
	
	
}

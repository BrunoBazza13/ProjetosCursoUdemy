package oo.encapsulamento.casaA;

public class Paulo {

	
	void testeAcesso() {
		
		Ana esposa = new Ana();
		
		
	//	System.out.println(esposa.segredo);  por ser privado so a classe ana tem acesso
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);	
		System.out.println(esposa.todosSabem);
		
		
		
		
		
	}
	
	
}

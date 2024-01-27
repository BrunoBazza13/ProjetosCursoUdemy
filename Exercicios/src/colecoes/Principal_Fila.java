package colecoes;

public class Principal_Fila {

	
	public static void main(String[] args) {
		
		Fila2 fila = new Fila2();
		
		
		fila.incluir(10);
		fila.incluir(20);
		fila.incluir(30);
		fila.incluir(40);
		fila.incluir(50);
		fila.incluir(60);
		fila.incluir(70);
		fila.incluir(80);
		fila.incluir(90);
		fila.incluir(100);
		fila.incluir(200);
		
		
		
		while (!fila.estaVazia()) {
			int f = fila.remover();
			
			System.out.printf("o elemento %d foi removido \n", f);
		}
		
		
	}
	
}

package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra = new Compra();
		compra.cliente = " Bruno Bazza";
		compra.adicionarItem(new Item("Caderno", 3, 9.99));
		compra.adicionarItem(new Item("caneta", 3, 2.99));
		compra.adicionarItem(new Item("Borracha", 1, 3.99));
	
	
		System.out.println(compra.itens.size());
		System.out.println(compra.obterValorTotal());
	
	
	}

	
	
}

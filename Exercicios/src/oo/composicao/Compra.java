package oo.composicao;

import java.util.ArrayList;

public class Compra {

	
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();// relacão 1 para n (uma compra tem muitos itens e um item tem uma compra)
											  // relação unidirecional
	
	
	
	void adicionarItem(Item item) { // relação bidirecional 
		this.itens.add(item);
		item.compra = this;
		
	}
	
	
	
	double obterValorTotal() {
		
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
			
		}
		
		return total;
		
	}
}

package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		
		
		
		Produto p1 = new Produto("Notebook",  2000.99);
		
		Produto.desconto = 0.3;
		
		var p2 = new Produto();
		p2.nome = "Caneta Azul";
		p2.preco = 2.99;
		//p2.desconto = 0.1;
		
		System.out.println(p1.nome +  " "  + p1.precoComDesconto());
		System.out.println(p2.nome +  " "  + p2.precoComDesconto());
		
	//	p2 = new Produto();
		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.25);
		double media = (precoFinal1 + precoFinal2) / 2;		

		
		System.out.println(p1);
		System.out.println(p2);
		System.out.printf("Média do carrinho: R$%.2f", media);
	
	}	
	
	
}

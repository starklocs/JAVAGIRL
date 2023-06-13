package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Balinha";
		p1.preco = 0.50;
		p1.desconto = 0.01;

		var p2 = new Produto();
		p2.nome = "Copo";
		p2.preco = 10.0;
		p2.desconto = 0.05;

		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);

	}
}

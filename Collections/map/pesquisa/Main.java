package collections.map.pesquisa;

public class Main {
	
	public static void main(String[] args) {
		
		EstoqueProdutos ep = new EstoqueProdutos();

		ep.adicionarProdutos(1L, "Produto A", 5.0, 10);
		ep.adicionarProdutos(2L, "Produto B", 10.0, 5);
		ep.adicionarProdutos(3L, "Produto C", 15.0, 2);
		
		ep.exibirProdutos();
		
		System.out.println("\nValor total do estoque: R$" + ep.calcularValorTotalEstoque());
		
		System.out.println("\nMaior valor do estoque: " + ep.obterProdutoMaisCaro());
		
	}

}

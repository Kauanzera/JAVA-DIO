package collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
	
	private Set<Produto> produtoSet;

	public CadastroProduto(){
		this.produtoSet = new HashSet<>();
	}
	
	
	public void adicionarProtudo(long codigo, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		
		//Por querermos um Set organizado em ordem alfabética, se é necessário utilizar o TreeSet, pois HashSet não deixa o Set formatado com o Comparable
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);		//Não se é necessário usar o Collections.sort(), pq o método sort é usado somente em uma list
		//O TreeSet, assim como o sort, identifica o comparable da classe onde o Set informado está, e age conforme o escopo da classe
		
		return produtoPorNome;		
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
		
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}

	
	public static void main(String[] args) {
		
		CadastroProduto cp = new CadastroProduto();
		
		cp.adicionarProtudo(1L, "Produto 5", 15d, 5);
		cp.adicionarProtudo(2L, "Produto 0", 20d, 10);
		cp.adicionarProtudo(1L, "Produto 3", 10d, 2);
		cp.adicionarProtudo(9L, "Produto 9", 2d, 2);
		
		
		System.out.println(cp.produtoSet);
		
		System.out.println(cp.exibirProdutosPorNome());
		System.out.println(cp.exibirProdutosPorPreco());
		
	}
	
}


package collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	//Instânciação de um Map, usando as boas práticas de oriêntação ao objetos
	private Map<Long, Produto> estoqueProdutoMap;
	
	public EstoqueProdutos() {
		this.estoqueProdutoMap = new HashMap<>();
	}
	

	public void adicionarProdutos(Long cod, String nome, double preco, int quantidade) {
		estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutoMap);
	}
	
	
	public double calcularValorTotalEstoque() {
	
		//Variável vazia para receber o valor e retorna-lo
		double valorTotalEstoque = 0;
		
		//Condição de verificação, para caso o Map esteja vazio
		if (!estoqueProdutoMap.isEmpty()) {
			
			//Laço de repetição para realizar o calculo entre o valor e quantidade de cada item do informado, puxando os dados de dentro da classe Produto
			for (Produto p : estoqueProdutoMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQuantidade();
			}
		}
		
		return valorTotalEstoque;
		
	}
	
	
	public Produto obterProdutoMaisCaro() {
		
//		Instânciação de um objeto que armazenará e retornará o valor para o método
		Produto produtoMaisCaro = null;
		
//		Instânciação de uma variável que possui um valor minímo para se armazenar valores maiores dentro de si
		double maiorPreco = Double.MIN_VALUE;
		
		if (!estoqueProdutoMap.isEmpty()) {
			
			//Laço de repetição para verificação de produtos dentro do Map
			for (Produto p : estoqueProdutoMap.values()) {
				
				//Laço condicional para verificar o valor do produto
				if (p.getPreco() > maiorPreco) {
					
					//Atribui o valor de p.getPreco() para a variável condicional usada no laço de repet
					maiorPreco = p.getPreco();
					
					//Atribui o Produto com o valor mais alto à variável que retornará o valor para o método
					produtoMaisCaro = p;
					
				}
			}
		}
		
		return produtoMaisCaro;
		
	}

}

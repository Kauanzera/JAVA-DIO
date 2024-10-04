package collections.set.ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
	
	private long codigo;
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public Produto(long codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	@Override
	public int compareTo(Produto p) {
		
		//Irá comparar e organizar em ordem alfabética
		return nome.compareToIgnoreCase(p.getNome());
	}	
	
	public String getNome() {
		return nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}


	@Override
	public String toString() {
		return String.format("\nProduto [codigo = %d - nome = %s - preco = %.1f - quantidade = %d]", codigo, nome, preco, quantidade);
	}



}

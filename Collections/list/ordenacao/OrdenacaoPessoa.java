package collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	
	//Instânciação da lista 'pessoaList'
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoa() {
		pessoaList = new ArrayList<Pessoa>();
	}
	
	
	
	
	
	//Método para adicionar pessoas na lista 'pessoaList'
	public void adicionarPessoa(String nome, int idade, double altura) {
		
		pessoaList.add(new Pessoa(nome, idade, altura));
		
	}
	
	
	
	
	
	//Método para manipular a lista 'pessoaList' e ordenar a lista por nome em ordem alfabética
	public List<Pessoa> ordernarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		
		//O método sort() vai entender que ele vai ter que ordenar a lista através da interface Comparable<Pessoa>, implementada na classe Pessoa
		Collections.sort(pessoasPorIdade);
		
		return pessoasPorIdade;
	}
	
	
	
	
	
	//Método para manipular a lista 'pessoaList' e ordernar a lista por ordem de altura, 
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		
		//O método sort() vai ordenar a lista através da classe ComparatorPorAltura(), sendo ela uma classe que existe um método com a interface Comparator em seu escopo
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		//Se a classe com o método Comparator não for declarada como segundo argumento, o método sort() vai puxar o método Comparable como default
		
		return pessoasPorAltura;
		
	}
	

}

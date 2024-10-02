package collections.list.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	//Criação e Instânciação da litsa 'livroList'
	private List<Livros> livroList;
	
	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	//Criação do método para adicionar livros na lista
	public void adicionarLivro(String titulo, String autor, Integer anoPublicacao) {
		livroList.add(new Livros(titulo, autor, anoPublicacao));
	}
	
	//Criação do método de pesquisar por livros dentro da lista, sendo o método uma lista para receber os valores depois.
	public List<Livros> pesquisaPorAutor(String autor){
		
		//Criação de uma lista para usar no método criado
		List<Livros> livrosPorAutor = new ArrayList<>();
		
		//Condição para verificar se a lista está vazia.
		if(!livroList.isEmpty()) {
			
			//Condição para repetir o processo até o fim da lista.
			for(Livros l : livroList) {
				
				//Condição para comparar se o nome do 'autor' coincide com o nome do autor informado.
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		
		//Retorna a lista criada dentro do método como valor para o método, que é uma lista
		return livrosPorAutor;
		
	}
	
	
	//Criação de um método list para pesquisar a diferença de anos de publicação de um livro
	public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		
		List<Livros> livrosPorIntervaloAnos = new ArrayList<>();
		
		if (!livroList.isEmpty()) {
			
			for (Livros l : livroList) {
				
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
					
				}
			}
		}
		
		return livrosPorIntervaloAnos;
		
	}
	
	//Criação de um método para pegar apenas a primeira aparição do titulo informado
	public Livros pesquisarPorTitulo(String titulo) {
		
		//Instânciado um objeto com valor nulo, para se poder inserir um valor depois
		Livros livroPorTitulo = null;
		
		if (!livroList.isEmpty()) {
			
			for(Livros l : livroList) {
				
				//Se o titulo for igual ao titulo informado, o objeto recebe o valor, e a condição termina 'break'
				if(l.getLivro().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		
		return livroPorTitulo;
		
	}

}

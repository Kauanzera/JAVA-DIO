package collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	//Instânciação de atributos e HashSet vazio
	private Set<Contato> contatoSet;
	
	public AgendaContatos() {
		contatoSet = new HashSet<>();
	}

	//Método para adicionar novos contatos no Set
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	//Método para imprimir os contatos do Set
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	//Método para fazer uma pesquisa no Set, procurando um nome
	public Set<Contato> pesquisarPorNome(String nome) {
		
		//Criação de um HashSet para ser possível manipular as informações de dentro do Set contatoSet
		Set<Contato> contatoPorNome = new HashSet<>();
		
		//Laço de repetição para se rodar todo o Set contatoSet
		for (Contato c : contatoSet) {
			
			//Condição de verificação, caso o nome seja o que está sendo proucurado, retorna para o set criado anteriormente
			if (c.getNome().startsWith(nome)) {		//startsWith é um método que verifica se a variável começa com o mesmo nome informado
				contatoPorNome.add(c);
			}
			
		}
		
		return contatoPorNome;
		
	}
	
	//Método para atualizar o número de algum contato, pesquisando pelo nome 
	public Contato atualizarNumeroContato(String nome, int novoNumero){
		
		//Instânciação de um objeto com valor nulo, que será voltado com um novo número pro nome informado
		Contato contatoAtualizado = null;
		for (Contato c : contatoSet) {
			
			//Condição de verificação para ver se o nome de dentro do Set, condiz com o nome informado, usando o método equalsIgnoreCase
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		
		return contatoAtualizado;
		
	}
	
}

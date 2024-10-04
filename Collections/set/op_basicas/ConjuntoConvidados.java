package collections.set.op_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	//Instânciação de um método Set
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	//Método para adicionar um convidado no Set
	public void adicionarPessoa(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	//Método para remover convidados do Set
	public void removerConvidadoCodigoConvite(int codigoConvite) {
		
		//Instânciação para acrescentar o valor que será removido
		Convidado convidadoRemover = null;
		
		//Laço para remoção de convidado pelo código (Primary Key)
		for (Convidado c : convidadoSet) {
			
			//Se o condigo do Convidado informado, for igual ao codigo armazenado...
			if (c.getCodigoConvidado() == codigoConvite) {
				convidadoRemover = c;
				break;
			}
			
		}
		
		//Método do Set para remoção de informações
		convidadoSet.remove(convidadoRemover);
		
	}
	
	//Método para contagem de convidados
	public int contarConvidados(){
		return convidadoSet.size();
	}
	
	//Método para exibir na tela todos os convidados
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
}

package collections.map.op_basicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	//Método para adicionar um elemento dentro do Map
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	//Método para remover um elemento do Map
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			
			//Por conta da key(nome) ser única no Map, não se é necessário o uso de laços de repetição para encontrar o valor procurado
			agendaContatoMap.remove(nome);
			
		}
	}
	
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		
		return numeroPorNome;
	}
	

}

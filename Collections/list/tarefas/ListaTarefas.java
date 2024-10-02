package collections.list.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	//Criado uma lista privada chamada TarefaList com a classe Tarefa como atributo.
	private List<Tarefa> tarefaList;
	
	//Construtor que transforma a lista em um ArrayList público para ser usado em outra classe
	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	//Métodos
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefaParaRemover);
	}
	
	public int NumeroTarefas() {
		return tarefaList.size();
	}
	
	public void descricaoTarefa() {
		System.out.println(tarefaList);
	}

}

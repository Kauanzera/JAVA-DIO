package collections.list.tarefas;

public class Main {
	public static void main(String[] args) {
		
		//Instânciação da classe ListaTarefas
		ListaTarefas lt = new ListaTarefas();
		
		//Impressão da lista vazia
		System.out.println("O número total de tarefas na lista é: " + lt.NumeroTarefas());
		
		//Inserção de tarefas na lista
		lt.adicionarTarefa("Tarefa ALFA");
		lt.adicionarTarefa("Tarefa BRAVO");
		lt.adicionarTarefa("Tarefa CHARLIE");
		
		//Impressão de tarefas
		System.out.println("O número total de tarefas na lista é: " + lt.NumeroTarefas());
		
		//Remoção de tarefas
		lt.removerTarefa("Tarefa ALFA");
		
		System.out.println("O número total de tarefas na lista é: " + lt.NumeroTarefas());
		
		//Impressão das informações da lista
		lt.descricaoTarefa();
		
	}
}

package collections.map.op_basicas;

public class Main {
	
	public static void main(String[] args) {
		
		AgendaContatos ac = new AgendaContatos();
		
		ac.adicionarContato("Kauan", 123456);
		ac.adicionarContato("Kauan", 4547);
		ac.adicionarContato("Kauan Oliveira", 111111);
		ac.adicionarContato("Kauan SeiLá", 654987);
		ac.adicionarContato("Maria Silva", 111111);

		ac.exibirContatos();
		
		ac.removerContato("Maria Silva");
		
		ac.exibirContatos();
		
		System.out.println("O número é: " + ac.pesquisarPorNome("Kauan Oliveira"));
		
		
	}

}

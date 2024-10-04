package collections.set.pesquisa;

public class Main {
	
	public static void main(String[] args) {
		
		AgendaContatos ag = new AgendaContatos();
		
		ag.adicionarContato("Kauan", 123456);
		ag.adicionarContato("Kauan", 4547);
		ag.adicionarContato("Kauan Oliveira", 111111);
		ag.adicionarContato("Kauan SeiLá", 654987);
		ag.adicionarContato("Maria Silva", 111111);
		
		ag.exibirContatos();
		
		//Imprimirá todas as ocasiões em que somente o nome Kauan aparece
		System.out.println(ag.pesquisarPorNome("Kauan"));
		
		//Atualiza o número do contato Maria Silva
		System.out.println(ag.atualizarNumeroContato("Maria Silva", 159753));
		
		ag.exibirContatos();
		
	}

}

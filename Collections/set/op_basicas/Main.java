package collections.set.op_basicas;

public class Main {
	
	public static void main(String[] args) {
		
		ConjuntoConvidados c = new ConjuntoConvidados();
		
		if (c.contarConvidados() == 0) {
			System.out.println("O Set esta vazio!!");
		}

		c.adicionarPessoa("Kauan", 10);
		c.adicionarPessoa("Jonas", 11);
		c.adicionarPessoa("Leonardo", 11);
		c.adicionarPessoa("Amanda", 13);
			
		c.exibirConvidados();
		System.out.printf("\nExistem %s convidados dentro do Set de Convidados!\n", c.contarConvidados());
		
		c.removerConvidadoCodigoConvite(13);
		c.exibirConvidados();
		
		
	}

}

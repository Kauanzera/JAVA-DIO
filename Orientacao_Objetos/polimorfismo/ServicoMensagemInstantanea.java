package polimorfismo;

public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	public abstract void salvarHistoricoMensagem();

	//Protected é um tipo no qual se é misturado o public e o private, fazendo com que as classes filhas de uma classe abstrata vejam a função, mas a class main não.
	protected void verificarConexao() {
		System.out.printf("\nVerificando Conexão com a Internet...\n");
	}
	
}

package polimorfismo;

public class MSNMessenger extends ServicoMensagemInstantanea {
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando Histórico de Mensagens MSN...");
	}
	
	public void enviarMensagem() {
		verificarConexao();
		System.out.println("Mensagem Enviada pelo MSN com Sucesso!");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		verificarConexao();
		System.out.printf("\nRecebendo Mensagem no MSN...\n");
		System.out.println("Mensagem Recebida no MSN!!");
		salvarHistoricoMensagem();
	}
}

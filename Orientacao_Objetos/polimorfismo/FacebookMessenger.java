package polimorfismo;

public class FacebookMessenger extends ServicoMensagemInstantanea{
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando Histórico de Mensagens no Facebook...");
	}
	
	public void enviarMensagem() {
		verificarConexao();
		System.out.println("Mensagem Enviada pelo Facebook com Sucesso!");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		verificarConexao();
		System.out.printf("Recebendo Mensagem no Facebook...\n");
		System.out.println("Mensagem Recebida no Facebook!!");
		salvarHistoricoMensagem();
	}
}

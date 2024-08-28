package polimorfismo;

public class TelegramMessenger extends ServicoMensagemInstantanea{
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando Histórico de Mensagens no Telegram...");
	}
	
	public void enviarMensagem() {
		verificarConexao();
		System.out.println("Mensagem Enviada pelo Telegram com Sucesso!");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		verificarConexao();
		System.out.printf("\nRecebendo Mensagem no Telegram...\n");
		System.out.println("Mensagem Recebida no Telegram!!");
		salvarHistoricoMensagem();
	}
}

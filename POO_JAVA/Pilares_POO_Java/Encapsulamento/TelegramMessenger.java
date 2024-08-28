package encapsulamento;

public class TelegramMessenger {
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Mensagem Enviada com Sucesso pelo Telegram!");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.printf("\nRecebendo Mensagem pelo Telegram!\n");
		validarConectadoInternet();
		System.out.println("Mensagem Recebida pelo Telegram!!");
		salvarHistoricoMensagem();
	}
	
	private void validarConectadoInternet() {
		System.out.printf("Validando se está conectado na internet...\n");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.printf("Salvando Histórico de mensagens no Telegram...\n");
	}
	

}

package abstracao;

public class TelegramMessenger extends ServicoMensagemInstantanea{
	
	public void enviarMensagem() {
		System.out.println("Mensagem Enviada pelo Telegram com Sucesso!");
	}
	
	public void receberMensagem() {
		System.out.printf("\nRecebendo Mensagem no Telegram...\n");
		System.out.println("Mensagem Recebida no Telegram!!");
	}
}

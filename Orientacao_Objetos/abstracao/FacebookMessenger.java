package abstracao;

public class FacebookMessenger extends ServicoMensagemInstantanea{
	
	public void enviarMensagem() {
		System.out.println("Mensagem Enviada pelo Facebook com Sucesso!");
	}
	
	public void receberMensagem() {
		System.out.printf("\nRecebendo Mensagem no Facebook...\n");
		System.out.println("Mensagem Recebida no Facebook!!");
	}
}

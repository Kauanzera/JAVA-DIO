package abstracao;

public class MSNMessenger extends ServicoMensagemInstantanea {
	
	public void enviarMensagem() {
		System.out.println("Mensagem Enviada pelo MSN com Sucesso!");
	}
	
	public void receberMensagem() {
		System.out.printf("\nRecebendo Mensagem no MSN...\n");
		System.out.println("Mensagem Recebida no MSN!!");
	}
}

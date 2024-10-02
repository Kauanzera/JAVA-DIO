package encapsulamento;

public class FacebookMessenger {
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Mensagem Enviada com Sucesso pelo Facebook Messenger!");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.printf("\nRecebendo Mensagem pelo Facebook Messenger!\n");
		validarConectadoInternet();
		System.out.println("Mensagem Recebida pelo Facebook Messenger!!");
		salvarHistoricoMensagem();
	}
	
	private void validarConectadoInternet() {
		System.out.printf("Validando se está conectado na internet...\n");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.printf("Salvando Histórico de mensagens do Facebook Messenger...\n");
	}
	

}

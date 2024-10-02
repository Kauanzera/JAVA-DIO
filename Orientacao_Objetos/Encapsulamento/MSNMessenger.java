package encapsulamento;

public class MSNMessenger {
	
	/* O que é Encapsulamento? -> Consiste na criação de um método no qual será incluido dentro dele, outras funções que seriam executadas separadamente.
	 * 
	 * Vantagens do Encapsulamento (Pelo o que eu entendi '-'):
	 *
	 * - Facilidade na leitura do método.
	 * - Melhor visualização do código que executará o método.
	 * 
	 */
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Mensagem Enviada com Sucesso pelo MSN Messenger!");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.printf("\nRecebendo Mensagem pelo MSN Messenger!\n");
		validarConectadoInternet();
		System.out.println("Mensagem Recebida pelo MSN Messenger!!");
		salvarHistoricoMensagem();
	}
	
	private void validarConectadoInternet() {
		System.out.printf("Validando se está conectado na internet...\n");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.printf("Salvando Histórico de mensagens no MSN Messenger...\n");
	}
	

}

package heranca;

//As outras classes irão herdar as informações da classe "SevicoMensagemInstantanea()" por todas elas usarem as mesmas funções em seus métodos.
public class ServicoMensagemInstantanea {
	
	/*
	 * Herança: Quando uma classe herda os dados e informações de outra classe para melhor entendimento e visualização do código.
	 * 
	 * Quando usar? -> Quando se necessário mais de um método usando as mesmas funções em seu escopo, assim, facilitando o entendimento do programa.
	 */
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Mensagem Enviada com Sucesso!");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.printf("\nRecebendo Mensagem\n");
		validarConectadoInternet();
		System.out.println("Mensagem Recebida!!");
		salvarHistoricoMensagem();
	}
	
	private void validarConectadoInternet() {
		System.out.printf("Validando se está conectado na internet...\n");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.printf("Salvando Histórico de mensagens...\n");
	}

}

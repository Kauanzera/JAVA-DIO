package polimorfismo;

public class ComputadorFabricio {

	public static void main(String[] args) {

		ServicoMensagemInstantanea smi = null;		//Declarando a class ServicoMensagemInstantanea com 'smi' e sem valor nenhum para ser usada
		
		/* Polimorfismo: Não se sabe o tipo de dado que será introduzido, mas todos terão o mesmo "chamado" no final (Linhas 28 e 29), fazendo com que cada um
		 * funcione do seu próprio jeito referente as funções declaradas, mas sejam "chamados" pelas mesmas funções.
		 * 
		 * Exemplo:
		 * Não se sabe qual app será escolhido por Pedrinho
		 * Mas independente de qual for, deverá realizar o envio e recebimento de mensagens
		 */
		
		String appEscolhido = "face";
		
		if (appEscolhido == "tel") {
			smi = new TelegramMessenger();
		}
		else if (appEscolhido == "msn") {
			smi = new MSNMessenger();
		}
		else if (appEscolhido == "face") {
			smi = new FacebookMessenger();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
			
		//Protected é um tipo no qual se é misturado o public e o private, fazendo com que as classes filhas de uma classe abstrata vejam a função, mas a class main não.
		//smi.verificarConexao();		Por estar no mesmo pacote que a classe na qual a função protegida "verificarConexao()" esta, o método funciona normalmente.
		
		
	}

}

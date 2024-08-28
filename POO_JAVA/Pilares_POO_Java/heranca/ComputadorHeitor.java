package heranca;

public class ComputadorHeitor {

	public static void main(String[] args) {

		MSNMessenger msn = new MSNMessenger();
		FacebookMessenger face = new FacebookMessenger();
		TelegramMessenger tel = new TelegramMessenger();

		System.out.println("MSN Messenger: ");
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("--------------------------------------------------------------");

		System.out.println("Facebook Messenger: ");
		face.enviarMensagem();
		face.receberMensagem();

		System.out.println("--------------------------------------------------------------");

		System.out.println("Telegram: ");
		tel.enviarMensagem();
		tel.receberMensagem();
		
	}

}

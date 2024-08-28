package encapsulamento;

public class ComputadorEduardo {

	public static void main(String[] args) {

		MSNMessenger msn = new MSNMessenger();
		FacebookMessenger face = new FacebookMessenger();
		TelegramMessenger tel = new TelegramMessenger();

		//Declarar bem os métodos para que não seja necessário chamar mais de um, sendo que um método poderia facilmente realizar eles, caso tenha sido encapsulado.
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("--------------------------------------------------------------");
		
		face.enviarMensagem();
		face.receberMensagem();

		System.out.println("--------------------------------------------------------------");
		
		tel.enviarMensagem();
		tel.receberMensagem();
	}

}

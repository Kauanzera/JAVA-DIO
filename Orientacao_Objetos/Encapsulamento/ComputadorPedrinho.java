package encapsulamento;

public class ComputadorPedrinho {

	public static void main(String[] args) {

		MSNMessenger msn = new MSNMessenger();

		//Declarar bem os métodos para que não seja necessário chamar mais de um, sendo que um método poderia facilmente realizar eles, caso tenha sido encapsulado.
		msn.enviarMensagem();
		
		msn.receberMensagem();
		
	}

}

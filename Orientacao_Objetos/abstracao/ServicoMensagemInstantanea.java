package abstracao;

//Será utilizado após a herança, fazendo com que cada classe seja obrigada a declarar o tal método que foi declarado abstrato na classe pai (ServicoMensagemInstantanea)
public abstract class ServicoMensagemInstantanea {
	/*
	 * Abstração: Tem a mesma função da herança, porém, o que muda é sua usabilidade entre as classes que se extendem da classe pai, fazendo com que cada classe 
	 * haja de um jeito diferente, referente aos seus métodos
	 * 
	 * Quando usar? -> Quando se tem uma classe herdada de outras que usam os mesmos métodos, mas de formas diferentes como no exemplo feito do facebook, msn e telegram.
	 * 
	 */
	
	//Modo de declaração de métodos abstratos:
	public abstract void enviarMensagem();		//Declarar como abstract e sem escopo
	public abstract void receberMensagem();
	
}

package collections.list.ordenacao;

public class Main {
	
	public static void main(String[] args) {
		
		OrdenacaoPessoa op = new OrdenacaoPessoa();
		
		op.adicionarPessoa("Kauan", 20, 1.82);
		op.adicionarPessoa("Gabriel", 30, 1.82);
		op.adicionarPessoa("Susan", 17, 1.76);
		op.adicionarPessoa("Giovanna", 19, 1.35);
		
		System.out.println(op.ordernarPorIdade());
		System.out.println(op.ordenarPorAltura());
		
	}

}

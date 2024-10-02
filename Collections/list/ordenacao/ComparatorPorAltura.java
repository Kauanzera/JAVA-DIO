package collections.list.ordenacao;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa>{

	public int compare(Pessoa p1, Pessoa p2) {
		
		//O Wrapper Double tem métodos próprios para manipular valores reais
		return Double.compare(p1.getAltura(), p2.getAltura());
		
	}	
	
}
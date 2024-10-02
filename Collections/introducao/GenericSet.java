package collections.introducao;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {
	
	public static void main(String[] args) {
		
		//Exemplo sem generics
		Set<Object> conjuntoSemGenerics = new HashSet<>();
		
		conjuntoSemGenerics.add("Exemplo 1");
		conjuntoSemGenerics.add(10);
		
		
		//Exemplo com generics
		Set<String> conjuntoGenerics = new HashSet<>();
		
		conjuntoGenerics.add("Exemplo 2");
		conjuntoGenerics.add("Exemplo 3");
		
		for (Object csg : conjuntoSemGenerics) {
			String str = (String) csg;
			System.out.println(str);
		}
		
		for (String ccg : conjuntoGenerics) {
			System.out.println(ccg);
		}
		
	}

}

package collections.introducao;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {
	
	public static void main(String[] args) {
		
		//Lista sem usar Generics
		List<Object> /*Object é uma Classe Mãe*/ listaSemGenerics = new ArrayList<>();
		
		listaSemGenerics.add("Exemplo 1");
		listaSemGenerics.add(10); //Pode-se atribuir qualquer tipo de valor para a lista, pois ela não usa tipos genéricos
		
		
		//Lista usando o generics
		List<String> listaGenerics = new ArrayList<>();
		
		listaGenerics.add("Exemplo 2");
		listaGenerics.add("Exemplo 3");	//Só se pode atribuir um valor de tipo String para a lista, pois ela usa um tipo genérico
		
		
		//Impressão da Lista sem Generics (Sendo necessário o casting)
		for (Object lsg : listaSemGenerics) {
			String str = (String) lsg;
			System.out.println(str);
		}
		
		
		//Iteração (Impressão) da Lista com Generics 
		for (String lcg : listaGenerics) {
			System.out.println(lcg);
		}
		
	}

}

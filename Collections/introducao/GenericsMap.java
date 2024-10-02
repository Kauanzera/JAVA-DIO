package collections.introducao;

import java.util.HashMap;
import java.util.Map;

public class GenericsMap {
	
	public static void main(String[] args) {
		
		//Exemplo sem Generics
		Map<Object, Object> mapaSemGenerics = new HashMap<>();
		
		mapaSemGenerics.put("Chave 1", "Elemento 1");
		mapaSemGenerics.put("Chave 2", 10);
		
		
		for (Object obj : mapaSemGenerics.entrySet()) {
			Map.Entry entry = (Map.Entry) obj;
			String chave = (String) entry.getKey();
			Object valor = entry.getValue();
			System.out.println("Chave: " + chave + " Valor: " + valor);
			
		}
		
		
		//Exemplo Com Generics
		Map<String, Integer> mapaComGenerics = new HashMap<>();
		
		mapaComGenerics.put("Chave 1", 10);
		mapaComGenerics.put("Chave 2", 24);
		
		
		for (Map.Entry<String, Integer> entry : mapaComGenerics.entrySet()) {
			String chave = entry.getKey();
			int valor = entry.getValue();
			System.out.println("Chave: " + chave + " Valor: " + valor);
		}
		
		
	}
	

}

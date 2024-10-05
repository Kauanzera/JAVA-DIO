package collections.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	
	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	//Método para adicionar um evento dentro do Map
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		//Evento ev = new Evento(nome, atracao);
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	//Método para exibir a agenda na tela
	public void exibirAgenda() {
		
		//A interface 'LocalDate' já possui em seu escopo, a interface Comparable, ou seja, ela já é organizada por si só
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		
		System.out.println(eventosTreeMap);
		
	}
	
	
	//Método para se obter o próximo evento que irá acontecer
	public void obterProximoEvento() {
		
		//Instânciação do objeto com a data atual, e os que serão usados para armazenar as datas dos próximos eventos
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		
		//Instânciação de um novo Map, tendo o TreeMap para ordenar junto do eventosMap
		Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
		
		//Laço de repetição para pesquisar o próximo evento dentro do map, usando os métodos do LocalDate
		for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
			
			//Laço de condição, verificando se a data é igual a atual ou se é depois da atual, para ser reconhecida como um evento próximo
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				
				//Atribuição de valores e impressão na tela dos mesmos
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				
				System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
				break;
			}
		}
	}
	
	

}

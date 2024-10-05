package collections.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
	
	public static void main(String[] args) {
		
		AgendaEventos av = new AgendaEventos();

		av.adicionarEvento(LocalDate.of(2004, Month.JANUARY, 14), "Evento 1", "Atração 1");
		av.adicionarEvento(LocalDate.of(2019, 2, 10), "Evento 2", "Atração 2");
		av.adicionarEvento(LocalDate.of(2022, 12, 25), "Evento 3", "Atração 3");
		av.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 04), "Evento 4", "Atração 4");
		av.adicionarEvento(LocalDate.of(2024, 10, 05), "Evento 5", "Atração 5");
		av.adicionarEvento(LocalDate.of(2025, Month.SEPTEMBER, 20), "Evento 6", "Atração 6");

		av.exibirAgenda();
		av.obterProximoEvento();
		
		
	}

}

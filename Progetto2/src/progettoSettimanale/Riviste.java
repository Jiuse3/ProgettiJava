package progettoSettimanale;

import java.time.LocalDate;

public class Riviste extends Catalogo {
	
	private Enum <Periodo> periodo;

	
	public Riviste(long codice, String titolo, LocalDate data, int num , Enum<Periodo> period) {
		super(codice, titolo, data, num);
		// TODO Auto-generated constructor stub
	}


	public Enum<Periodo> getPeriodo() {
		return periodo;
	}


	public void setPeriodo(Enum<Periodo> periodo) {
		this.periodo = periodo;
	}


	@Override
	public String toString() {
		return "\n Titolo rivista: " + getTitolo() + " || Periodicità: " + getPeriodo() + " || Data pubblicazione: " + getData();
	}


		
	
	
	

}

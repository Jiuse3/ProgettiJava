package progettoSettimanale;

import java.time.LocalDate;

public abstract class Catalogo {
	private long codice;
	private String titolo;
	private LocalDate data;
	private int num;
	public Catalogo(long codice, String titolo, LocalDate data, int num) {
		super();
		this.codice = codice;
		this.titolo = titolo;
		this.data = data;
		this.num = num;
	}
	public long getCodice() {
		return codice;
	}
	public void setCodice(long codice) {
		this.codice = codice;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	

}

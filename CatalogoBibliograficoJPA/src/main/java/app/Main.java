
package app;

import entities.Period;

public class Main {

	public static void main(String[] args) {
	
		
		MainDAO e = new MainDAO();
		
		e.inseriscitUtente("Anish", "Frigerio", 1999, 8, 22, 0011);
		e.inseriscitUtente("Giovanni", "Galatioto", 1991,7, 18, 0012);
		e.inseriscitUtente("Jiuse", "Neri", 1996, 23, 6, 0013);
		
		e.insertLibro(101, "Harry Potter", 1997,300, "J.K. Rowling", "Fantascienza");
		e.insertLibro(102, "Peter Pan", 1976, 350, "Peter", "Fantascienza");
		e.insertLibro(103, "Signore degli Anelli", 1999, 400, "Tolkien", "Fantascienza");
		
		
		e.inseriscitRivista(104, "Focus", 2016, 40, Period.MENSILE);
		e.inseriscitRivista(105, "Playboy",2018, 50, Period.SETTIMANALE);
		e.inseriscitRivista(106, "Time",2023,47, Period.SEMESTRALE);
		
		e.inserisciPrestito(1, 4, 2023, 3, 12);
		e.inserisciPrestito(2, 3, 2023, 2, 19);
		e.inserisciPrestito(3, 1, 2023, 4, 1);
	
		
//		e.getElementoPerISBN(101);
//		e.getElementoPerISBN(102);
//		
//		e.getElementoPerAnno(2023);
//		e.getElementoPerAnno(2000);
//		
//		e.getElementoPerAutore("Peter");
//		
//		e.getElementoPerTitolo("Harry Potter");
//		e.getElementoPerTitolo("ciao");
		
		e.close();

	}

}
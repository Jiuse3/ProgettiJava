package progettoSettimanale;

import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		try {
			FileWriter myWriter = new FileWriter("/Users/rokiseydi/desktop/COMPITISETT/Progetto2/CatalogoBiblioteca.txt");
			myWriter.write("lets go!");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		

		List<Catalogo> catalogo = new ArrayList<>();
			
		
		
		int num = -1;
		
		do {

			System.out.println("Seleziona l'azione che vuoi svolgere (0 annulla la richiesta):");
			System.out.println("1 > Aggiungi Libro al catalogo");
			System.out.println("2 > Aggiungi Rivista al catalogo");
			System.out.println("3 > Elemento nel catalogo inserendo il codice ISBN");
			System.out.println("4 > Elemento nel catalogo inserendo Data di Pubblicazione");
			System.out.println("5 > Libro nel catalogo inserendo il nome dell'Autore");
			System.out.println("6 > Rimuovi Elemento dal catalogo inserendo il codice ISBN");
			System.out.println("7 > Stampa catalogo");
			try {
				num = in.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			switch (num) {
				case 1:
					addBook(catalogo); 
				break;
				case 2:
					addMag(catalogo); 
				break;
				case 3:
					findItemByCode(catalogo);
				break;
				case 4:
					findItemByDate(catalogo);
				break;
				case 5:
					findItemByAuthor(catalogo);
				break;
				case 6:
					removeItemByCode(catalogo);
					break;
				case 7:
					System.out.println(" Catalogo ");
					System.out.println(catalogo);
					System.out.println();
					break;
				case 0:
					System.out.println("CHIUSURA PROGRAMMA");
					break;
				default:
					System.out.println("Attenzione - inserisci un numero corretto!");
			}
		}while(num != 0);
		
	}

	public static void addBook(List<Catalogo> list) {
		System.out.println("Inserisci titolo libro:");
		String titolo = in.next();
		System.out.println("Anno di uscita:");
		int anno= in.nextInt();
		System.out.println("Mese di uscita:");
		int mese = in.nextInt();
		System.out.println("Giorno di uscita:");
		int giorno = in.nextInt();
		System.out.println("Numero di pagine:");
		int pagina = in.nextInt();
		System.out.println("Autore libro:");
		String autore = in.next();
		System.out.println("Genere libro:");
		String genere = in.next();
		System.out.println("ISBN Libro");
		long isbn = in.nextLong();
		list.add(new Libri(isbn , titolo, LocalDate.of(anno, mese, giorno), pagina, autore, genere ));
		System.out.println("Catalogo con Aggiunta");
		System.out.println(list);
		System.out.println();
		modifyDati(list);
	}
	
	public static void addMag(List<Catalogo> list) {
		System.out.println("Titolo rivista:");
		String titolo = in.next();
		System.out.println("Anno di pubblicazione:");
		int year = in.nextInt();
		System.out.println("Mese di pubblicazione:");
		int month = in.nextInt();
		System.out.println("Giorno di pubblicazione:");
		int day = in.nextInt();
		System.out.println("Numero di pagine:");
		int pag = in.nextInt();
		System.out.println("Inserisci periodicità della rivista: \n 1.settimanale \n 2.mensile \n 3.semestrale");
		int period = in.nextInt();
		list.add(new Riviste(18988984, titolo, LocalDate.of(year, month, day), pag, period(period)));
		System.out.println("Catalogo con Aggiunta ");
		System.out.println(list);
		System.out.println();
		modifyDati(list);
	}
	
	public static Periodo period(int period) {
		switch(period) {
		case 1:
			return Periodo.SETTIMANA;

		case 2:
			return Periodo.MENSILE;

		case 3:
			return Periodo.SEMESRTALE;

			default:
				System.out.println("Ridigita");
		}
		return null;
	}

	public static void removeItemByCode(List<Catalogo> list ) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci codice ISBN del libro/rivista da eliminare");
        long isbn = input.nextLong();
        input.close();
		for (int i = 0; i<list.size(); i++) {
			if(list.get(i) != null && list.get(i).getCodice() == isbn) {
				list.remove(i);
			}
		};
		System.out.println("Catalogo con Rimozione ");
		System.out.println(list);
		System.out.println();
		modifyDati(list);
	}

	public static void findItemByCode(List<Catalogo> list ) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci codice ISBN del libro/rivista da eliminare");
        long isbn = input.nextLong();
		Stream<Catalogo> stream = list.stream().filter((p) -> p.getCodice() == isbn);
		System.out.println("ISBN ");
		in.nextLine();
			stream.forEach(p -> System.out.println(p));
			System.out.println();
	}

	public static void findItemByDate(List<Catalogo> list) {
		Stream<Catalogo> stream = list.stream().filter((p) -> p.getData() == LocalDate.of(9999,3,4));
		System.out.println("Cerca elemento con Data");
			stream.forEach(p -> System.out.println(p));
			System.out.println();
	}

	public static void findItemByAuthor(List<Catalogo> list) {
		Stream<Catalogo> stream = list.stream().filter((p) -> p.getClass() == Libri.class).filter(p-> ((Libri) p).getAutore() == "Dumas");
		System.out.println("Cerca elemento per Autore ");
			stream.forEach(p -> System.out.println(p));
			System.out.println();
		
	}

	public static void modifyDati( List<Catalogo> list) {
		try {
			FileWriter myWriter = new FileWriter("/Users/rokiseydi/desktop/COMPITISETT/Progetto2/CatalogoBiblioteca.txt");
			myWriter.write(list.toString());
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}


}

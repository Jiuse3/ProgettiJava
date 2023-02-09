package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("Libro")
@Getter
@Setter

public class Libri extends Catalogo {
	private String autore;
	private String genere;
	

	




	@Override
	public String toString() {
		return "Titolo: "+this.getTitle()+". Autore: "+this.getAutore()+". Genere: "+this.getGenere()+". Anno di pubblicazione: "+this.getReleaseYear()+". Numero di pagine: "+this.getNumOfPages()+". Codice ISBN: "+this.getIsbn()+"\n";
	}

}

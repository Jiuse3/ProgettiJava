package com.youssoufaseydi.B.progettoBe4.CONFIGURATION;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.youssoufaseydi.B.progettoBe4.ENTITY.Edificio;
import com.youssoufaseydi.B.progettoBe4.ENTITY.Postazione;
import com.youssoufaseydi.B.progettoBe4.ENTITY.Utente;
import com.youssoufaseydi.B.progettoBe4.enumerated.TipoPostazione;

@PropertySource("application.properties")
@Configuration
public class Configurationh {

	/////////////////////////EDIFICI/////////////////////
	
	@Value("${gestione.e1.nome}")
	private String e1Nome;
	
	@Value("${gestione.e1.indirizzo}")
	private String e1Indirizzo;
	
	
	@Value("${gestione.e1.citta}")
	private String e1Citta;

	@Bean
	 Edificio e1() {
		Edificio e = Edificio.builder()
				.name(e1Nome)
				.indirizzo(e2Indirizzo)
				.citta(e1Citta)
				.build();
		return e;
	}
	
	

	@Value("${gestione.e2.nome}")
	private String e2Nome;
	
	@Value("${gestione.e2.indirizzo}")
	private String e2Indirizzo;
	
	
	@Value("${gestione.e2.citta}")
	private String e2Citta;

	@Bean
	Edificio edi2() {
		Edificio e = Edificio.builder()
				.name(e2Nome)
				.indirizzo(e2Indirizzo)
				.citta(e2Citta)
				.build();
		return e;
}

	///////////////UTENTI
	
	@Bean
	Utente u1() {
		Utente e = Utente.builder().fullName("Joussoufa seydi").userName("Jiuse").email("jou-inter@hotmail.it").build();
		return e;
	}

	@Bean
	Utente u2() {
		Utente e = Utente.builder().fullName("Anish frigerio").userName("tom").email("tom@gmail.com").build();
		return e;
	}

	@Bean
	Utente u3() {
		Utente e = Utente.builder().fullName("Giovanni Galatioto").userName("gigi").email("gigigala@gmail.com").build();
		return e;
	}
	
	////////////PRENOTAZIONI
	
	
	@Bean
	Postazione p1() {
		Postazione e = Postazione.builder().descrizione(" privato").tipo(TipoPostazione.PRIVATO).maxOccupanti(10).edificio(e1()).build();
		return e;
	}
	
	@Bean
	Postazione p2() {
		Postazione e = Postazione.builder().descrizione("Sala riunioni").tipo(TipoPostazione.SALARIUNIONI).maxOccupanti(20).edificio(edi2()).build();
		return e;
	}
	
	@Bean
	Postazione p3() {
		Postazione e = Postazione.builder().descrizione("Spazio libero").tipo(TipoPostazione.OPENSPACE).maxOccupanti(50).edificio(edi2()).build();
		return e;
 }
}

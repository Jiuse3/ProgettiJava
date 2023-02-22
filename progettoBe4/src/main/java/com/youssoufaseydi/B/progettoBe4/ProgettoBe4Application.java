
/*Si deve realizzare un applicativo per la gestione delle prenotazioni delle postazioni aziendali.
Ogni postazione è identificata da un codice univoco, una descrizione, un tipo [PRIVATO, OPENSPACE, SALA RIUNIONI], un numero massimo di occupanti ed un edificio. L'edificio ha un nome, un indirizzo ed una città.
Una postazione può essere prenotata da un utente, che è identificato da uno username, un nome completo ed una email. La prenotazione vale per un solo giorno e può essere effettuata solo se per quel giorno la postazione risulta libera. Un utente può ricercare le postazioni indicando il tipo di postazione desiderato e la città di interesse.
Un utente può avere più prenotazioni in corso, ma non può prenotare più di una postazione per una particolare data.

Realizzare una applicazione Spring Boot, denominata GestionePrenotazioni, ed implementare il modello dei dati necessario a realizzare l'applicazione. Implementare la persistenza utilizzando Spring Data JPA, realizzando database e repositories necessari, oltre al mapping delle entities persistenti.
Implementazione dati: a piacere (application.properties, beans, hard-coded in db, hard-coded in Java)
strategia: JPA oppure JDBC
diagrammi ER: opzionali*/

package com.youssoufaseydi.B.progettoBe4;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.youssoufaseydi.B.progettoBe4.CONFIGURATION.Configurationh;
import com.youssoufaseydi.B.progettoBe4.DAO.EdificioService;
import com.youssoufaseydi.B.progettoBe4.DAO.PostazioneService;
import com.youssoufaseydi.B.progettoBe4.DAO.PrenotazioneService;
import com.youssoufaseydi.B.progettoBe4.DAO.UtenteService;
import com.youssoufaseydi.B.progettoBe4.ENTITY.Edificio;
import com.youssoufaseydi.B.progettoBe4.ENTITY.Postazione;
import com.youssoufaseydi.B.progettoBe4.ENTITY.Prenotazione;

import com.youssoufaseydi.B.progettoBe4.ENTITY.Utente;
import com.youssoufaseydi.B.progettoBe4.enumerated.TipoPostazione;





@SpringBootApplication
public class ProgettoBe4Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProgettoBe4Application.class, args);
	}
		
		@Autowired
		EdificioService edis;
		
		@Autowired
		PostazioneService prens;
		
		@Autowired
		UtenteService uts;
		
		@Autowired
		PrenotazioneService prenos;
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configurationh.class);

	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		boolean insertEdifici = false;
		if( insertEdifici ) {
			insertEdifici();
		}
		
		boolean insertPostazioni = true;
		if( insertPostazioni ) {
			insertPostazioni();
		}
		
		boolean insertUtenti = false;
		if( insertUtenti ) {
			insertUtenti();
		}
		
	
		
		((AnnotationConfigApplicationContext)ctx).close();
		
	}



	private void insertEdifici() {
		// TODO Auto-generated method stub
		
		Edificio e1 = (Edificio)ctx.getBean("edi1");
		edis.insert(e1);
		
		Edificio e2 = (Edificio)ctx.getBean("edi2");
		edis.insert(e2);
		
	}
	
	
	private void insertPostazioni() {
		Postazione p1 = (Postazione)ctx.getBean("p1");
		prens.insert(p1);
		
		Postazione p2 = (Postazione)ctx.getBean("p2");
		prens.insert(p2);
		
		Postazione p3 = (Postazione)ctx.getBean("p3");
		prens.insert(p3);
		
	}
	
	public void insertUtenti() {
		Utente u1 = (Utente)ctx.getBean("u1");
		uts.insert(u1);
		
		Utente u2 = (Utente)ctx.getBean("u2");
		uts.insert(u2);
		
		Utente u3 = (Utente)ctx.getBean("u3");
		uts.insert(u3);
	}
	
	public void insertPrenotazioni() {
		Prenotazione p1 = (Prenotazione)ctx.getBean("pr1");
		prenos.insert(p1);
		
		Prenotazione p2 = (Prenotazione)ctx.getBean("pr2");
		prenos.insert(p2);
		
		Prenotazione p3 = (Prenotazione)ctx.getBean("pr3");
		prenos.insert(p3);

    }
	
	public void findByType(TipoPostazione tp) {
		List<Postazione> lp = prens.findByType(tp.toString());
		System.out.println(lp);
		
		lp.stream().forEach(p -> {
			System.out.println(p.getTipo() + " " + p.getEdificio());
		});
}
}


package com.youssoufaseydi.B.progettoBe4.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import com.youssoufaseydi.B.progettoBe4.ENTITY.Prenotazione;

public class PrenotazioneService {
	
	@Autowired
	private PrenotazioneRepository prenot;
	
	public void insert(Prenotazione p) {
		prenot.save(p);
	}

}

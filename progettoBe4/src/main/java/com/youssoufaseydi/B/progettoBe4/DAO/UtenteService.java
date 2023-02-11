package com.youssoufaseydi.B.progettoBe4.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youssoufaseydi.B.progettoBe4.ENTITY.Utente;


@Service
public class UtenteService {
	
	@Autowired
	private UtenteRepository utentiRepo;
	
	public List<Utente> getAll() {
		return utentiRepo.findAll();
	}

	public void insert(Utente u) {
		utentiRepo.save(u);
		
	}

}

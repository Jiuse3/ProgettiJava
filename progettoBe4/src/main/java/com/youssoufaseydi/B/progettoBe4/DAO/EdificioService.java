package com.youssoufaseydi.B.progettoBe4.DAO;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.youssoufaseydi.B.progettoBe4.ENTITY.Edificio;



@Service
public class EdificioService {
	
	@Autowired
	private EdificioRepository edificiRepo;
	
	public List<Edificio> getAll() {
		return edificiRepo.findAll();
	}
	
	public void insert(Edificio p) {
		edificiRepo.save(p);
	}
	

}

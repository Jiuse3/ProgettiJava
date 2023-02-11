package com.youssoufaseydi.B.progettoBe4.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youssoufaseydi.B.progettoBe4.ENTITY.Postazione;



@Service
public class PostazioneService {

	@Autowired
	private PostazioneRepository postazioneRepo;
	
	public List<Postazione> getAll() {
		return postazioneRepo.findAll();
	}
	
	public Optional<Postazione> getById(int id){
		return  postazioneRepo.findById(id);
	}

	public void insert(Postazione p) {
		postazioneRepo.save(p);
	}
	
	public List<Postazione> findByType(String s) {
		return postazioneRepo.findByFullname(s);
				
	}
	
}

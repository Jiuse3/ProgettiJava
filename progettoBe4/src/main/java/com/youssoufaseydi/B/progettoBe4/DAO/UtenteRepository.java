package com.youssoufaseydi.B.progettoBe4.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youssoufaseydi.B.progettoBe4.ENTITY.Utente;


@Repository
	public interface UtenteRepository extends JpaRepository<Utente , Integer>  {
		
			

   
}

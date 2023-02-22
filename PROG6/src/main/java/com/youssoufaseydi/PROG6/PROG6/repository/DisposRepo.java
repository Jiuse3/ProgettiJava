package com.youssoufaseydi.PROG6.PROG6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.youssoufaseydi.PROG6.PROG6.entities.Dispositivo;
import com.youssoufaseydi.PROG6.PROG6.entities.StatoDispos;


@Repository
public interface DisposRepo extends JpaRepository<Dispositivo, Integer> {

	@Modifying
	@Query("update dispositivi SET user_id=:userid, stato='ASSEGNATO' where id=1")
	void assegnaDispositivo(@Param("userid") int userid, @Param("stato") StatoDispos s, @Param("id") int id);
	
	@Query("SELECT * FROM dispositivi WHERE stato = :stato")
	List<Dispositivo> getDispByStato(@Param("stato")String s);
	
}

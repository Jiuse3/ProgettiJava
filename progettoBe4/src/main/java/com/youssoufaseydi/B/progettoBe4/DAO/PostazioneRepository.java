package com.youssoufaseydi.B.progettoBe4.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.youssoufaseydi.B.progettoBe4.ENTITY.Postazione;

public interface PostazioneRepository extends JpaRepository<Postazione, Integer>  {
	@Query(
			nativeQuery = true,
			value = "SELECT * FROM postazioni WHERE tipo = :t"
		)
		List<Postazione> findByFullname(@Param("t") String fn);

}

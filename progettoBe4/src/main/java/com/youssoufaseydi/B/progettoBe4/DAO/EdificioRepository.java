package com.youssoufaseydi.B.progettoBe4.DAO;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.youssoufaseydi.B.progettoBe4.ENTITY.Edificio;



@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer> {

	
}

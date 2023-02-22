package com.youssoufaseydi.B.progettoBe4.ENTITY;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "utente_id", referencedColumnName = "id")
	private Utente utente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "postazione_id", referencedColumnName = "id")
	private Postazione postazione;
	
	private LocalDate data;
	
}

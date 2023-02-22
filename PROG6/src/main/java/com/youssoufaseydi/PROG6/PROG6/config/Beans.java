package com.youssoufaseydi.PROG6.PROG6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.youssoufaseydi.PROG6.PROG6.entities.Dispositivo;
import com.youssoufaseydi.PROG6.PROG6.entities.Role;
import com.youssoufaseydi.PROG6.PROG6.entities.RoleType;
import com.youssoufaseydi.PROG6.PROG6.entities.StatoDispos;
import com.youssoufaseydi.PROG6.PROG6.entities.TipoDispositivo;
import com.youssoufaseydi.PROG6.PROG6.entities.User;

@Configuration
public class Beans {

	@Bean
	@Scope("prototype")
	public User user(String name, String lastname, String email, String password) {
		
		return User.builder()
				.name(name)
				.lastname(lastname)
				.email(email)
				.password(password)
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Role role(RoleType r) {
		return Role.builder()
				.role(r)
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Dispositivo dispos(TipoDispositivo td, StatoDispos sd) {
		return Dispositivo.builder()
				.tipo(td)
				.stato(sd)
				.build();
	}
}

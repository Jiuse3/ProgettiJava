package com.youssoufaseydi.PROG6.PROG6;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.youssoufaseydi.PROG6.PROG6.entities.Dispositivo;
import com.youssoufaseydi.PROG6.PROG6.entities.Role;
import com.youssoufaseydi.PROG6.PROG6.entities.StatoDispos;
import com.youssoufaseydi.PROG6.PROG6.entities.User;
import com.youssoufaseydi.PROG6.PROG6.service.DaoService;

@SpringBootApplication
public class Prog6Application implements CommandLineRunner {
		
	@Autowired
	private DaoService ds;


	public static void main(String[] args) {
		SpringApplication.run(Prog6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
	
	
	public void populateRole(Role r) {
		ds.saveRole(r);
	}
	
	public void populateUsers(User u) {
		ds.saveUser(u);
	}
	
	public void populateDispositivi(Dispositivo d) {	
		ds.saveDispos(d);
	}
	
	private void getRolesFromUserById(int id) {
        Optional<User> authUserObj = ds.getUserById(id);
        User authUser = authUserObj.get();
        String role = "USER";
        Set<Role> roles = authUser.getRoles();

        for( Role r : roles ) {
            if( r.getRole().toString().contains("ADMIN") ) {
                role = "ADMIN";
                break;
            }
        }

        System.out.println(role);
    }
	
	public void assegnaDispos(Dispositivo d, User u) {
			
		String s = null;
		
		switch(d.getStato()) {
		
		case DISPONIBILE:
			ds.update(u.getId(), StatoDispos.ASSEGNATO, d.getId());
			s = "Dispositivo assegnato correttamente all'utente" + u.getName() + u.getLastname();
			break;
		
		case ASSEGNATO:
			s = "Dispositivo occupato";
			break;
			
		case DISMESSO:
			s = "Dispositivo non disponibile";
			break;
			
		case IN_MANUTENZIONE:
			s = "Dispositivo in manutenzione";
			break;
		}
		System.out.println(s);	
	}

}
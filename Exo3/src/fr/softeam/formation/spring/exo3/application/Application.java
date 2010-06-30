package fr.softeam.formation.spring.exo3.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;

import fr.softeam.formation.spring.exo3.service.iface.IGestionnaireReunion;
import fr.softeam.spring.modele.Personne;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		IGestionnaireReunion gestionnaireReunion = (IGestionnaireReunion) context.getBean("gestionnaireReunion");

		try {
			gestionnaireReunion.creerPersonne("1", "toto", "Jean", "jean@toto.fr");
		}
		catch (DataIntegrityViolationException e) {
			System.out.println("Personne already created but it's OK for our app");
		}
		Personne personne = gestionnaireReunion.rechercherPersonne("1");
		
		if (personne != null) 
		{
			personne.setNom("Bono");
		
			gestionnaireReunion.sauverPersonne(personne);
		}
		else
		{
			System.err.println("Error personne id='1' not found");
		}
	}

}

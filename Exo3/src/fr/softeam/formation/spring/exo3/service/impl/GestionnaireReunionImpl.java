package fr.softeam.formation.spring.exo3.service.impl;

import sun.awt.PeerEvent;
import fr.softeam.formation.spring.exo3.dao.iface.IPersonneDAO;
import fr.softeam.formation.spring.exo3.service.iface.IGestionnaireReunion;
import fr.softeam.spring.modele.Personne;

public class GestionnaireReunionImpl implements IGestionnaireReunion {

	IPersonneDAO personneDAO;
	
	public void setPersonneDAO(IPersonneDAO personneDAO) {
		this.personneDAO = personneDAO;
	}

	@Override
	public void creerPersonne(String id, String nom, String prenom,
			String adresseMail) {
		
		Personne personne = new Personne();
		personne.setId(id);
		personne.setNom(nom);
		personne.setPrenom(prenom);
		personne.setAdresseMail(adresseMail);
		personneDAO.creer(personne);
	}

	@Override
	public Personne rechercherPersonne(String id) {
		return personneDAO.rechercherSelonId(id);
	}

	@Override
	public void sauverPersonne(Personne personne) {
		personneDAO.sauver(personne);
	}

}

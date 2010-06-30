package fr.softeam.formation.spring.exo3.dao.iface;

import fr.softeam.spring.modele.Personne;

public interface IPersonneDAO {
	public void creer(Personne personne);
	public Personne rechercherSelonId(String id);
	public void sauver(Personne personne);
	public void supprimer(Personne personne);
}

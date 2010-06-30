package fr.softeam.formation.spring.exo3.dao.iface;

import fr.softeam.spring.modele.Salle;

public interface ISalleDAO {
	public void creer(Salle salle);
	public Salle rechercherSelonId(String id);
	public void sauver(Salle salle);
	public void supprimer(Salle salle);
}

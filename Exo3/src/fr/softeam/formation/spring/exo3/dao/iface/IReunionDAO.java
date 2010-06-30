package fr.softeam.formation.spring.exo3.dao.iface;

import java.util.Date;
import java.util.List;

import fr.softeam.spring.modele.Personne;
import fr.softeam.spring.modele.Reunion;
import fr.softeam.spring.modele.Salle;

public interface IReunionDAO {
	public void creer(Reunion reunion);
	public Reunion recherhcerSelonId(String id);
	public void sauver(Reunion reunion);
	public void supprimer(Reunion reunion);
	public List<Reunion> rechercherSelonParticipant(Personne personne, Date dateDebut, Date dateFin);
	public List<Salle> rechercherSelonSalle(Salle salle, Date dateDebut, Date dateFin);
}

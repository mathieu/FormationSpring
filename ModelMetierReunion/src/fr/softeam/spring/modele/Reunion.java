package fr.softeam.spring.modele;

import java.util.Date;
import java.util.Set;

public class Reunion {
	
	private String id;
	
	public void setId(String pId)
	{
		id = pId;
	}
	
	public String getId()
	{
		return id;
	}
	
	private String objet;
	
	public void setObjet(String pObjet)
	{
		objet = pObjet;
	}
	
	public String getObjet()
	{
		return objet;
	}
	
	private Date dateDebut;
	
	public void setDateDebut(Date pDate)
	{
		dateDebut = pDate;
	}
	
	public Date getDateDebut()
	{
		return dateDebut;
	}
	
	private Date dateFin;
	
	public void setDateFin(Date pDate)
	{
		dateFin = pDate;
	}
	
	public Date getDateFin()
	{
		return dateFin;
	}
	
	private Set<Personne> participants;
	
	public void setParticipants(Set<Personne> pParticipants)
	{
		participants = pParticipants;
	}
	
	public Set<Personne> getParticipants()
	{
		return participants;
	}
	
	private Personne organisateur;
	
	public void setOrganisateur(Personne pOrganisateur)
	{
		organisateur = pOrganisateur;
	}
	
	public Personne getOrganisateur()
	{
		return organisateur;
	}
	
	private Salle salle;
	
	public void setSalle(Salle pSalle)
	{
		salle = pSalle;
	}
	
	public Salle getSalle()
	{
		return salle;
	}

}

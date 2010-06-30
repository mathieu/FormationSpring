package fr.softeam.spring.modele;

public class Personne {
	
	private String id;
	
	public void setId(String pId)
	{
		id = pId;
	}
	
	public String getId()
	{
		return id;
	}
	
	private String nom;
	
	public void setNom(String pNom)
	{
		nom = pNom;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	private String prenom;
	
	public void setPrenom(String pPrenom)
	{
		prenom = pPrenom;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
	private String adresseMail;
	
	public void setAdresseMail(String pAdresseMail)
	{
		adresseMail = pAdresseMail;
	}
	
	public String getAdresseMail()
	{
		return adresseMail;
	}

}

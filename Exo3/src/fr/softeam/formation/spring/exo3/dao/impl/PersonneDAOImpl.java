package fr.softeam.formation.spring.exo3.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import fr.softeam.formation.spring.exo3.dao.iface.IPersonneDAO;
import fr.softeam.spring.modele.Personne;

public class PersonneDAOImpl  extends SimpleJdbcDaoSupport implements IPersonneDAO {

	@Override
	public void creer(Personne personne) {
		getJdbcTemplate().update("INSERT INTO Personne(id,nom,prenom,adresseMail) VALUES(?,?,?,?)", new Object[]{personne.getId(), personne.getNom(), personne.getPrenom(), personne.getAdresseMail()});
	}

	@Override
	public Personne rechercherSelonId(String id) {
		return getSimpleJdbcTemplate().queryForObject("select * from Personne WHERE id=?" 
				,new ParameterizedRowMapper<Personne>() {
					@Override
					public Personne mapRow(ResultSet rs, int rowNum) throws SQLException {
						Personne personne = new Personne();
						personne.setId(rs.getString("id"));
						personne.setNom(rs.getString("nom"));
						personne.setPrenom(rs.getString("prenom"));
						personne.setAdresseMail(rs.getString("adresseMail"));
						return personne;
					}
				},new Object[]{id});
	}

	@Override
	public void sauver(Personne personne) {
		Integer nb = getSimpleJdbcTemplate().update(
				"UPDATE Personne set nom=:nom, prenom=:prenom, adresseMail=:adresseMail WHERE id=:id",
				personne.getNom(), personne.getPrenom(), personne.getAdresseMail(), personne.getId());
		System.out.println("nb = " + nb); 
	}

	@Override
	public void supprimer(Personne personne) {
		getJdbcTemplate().update("DELETE from Personne where id=?",new Object[]{ personne.getId()});
	} 
}

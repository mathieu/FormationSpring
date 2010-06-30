package fr.softeam.spring.service;

public interface ICalculatrice {

	/**
	 * Initialise la calculatrice. Remet � 0 le total
	 *
	 */
	void initialiser();
	
	/**
	 * Additionne la valeur pass�e en param�tre au total courant de la calculatrice
	 * Retourne le nouveau total obtenu.
	 */
	int additionner(int operande);

	/**
	 * Soustrait la valeur pass�e en param�tre au total courant de la calculatrice
	 * Retourne le nouveau total obtenu.
	 */
	int soustraire(int operande);
	
	/**
	 * Multiplie la valeur pass�e en param�tre avec le total courant de la calculatrice
	 * Retourne le nouveau total obtenu.
	 */
	int multiplier(int operande);
	
	/**
	 * Divise le total courant de la calculatrice par la valeur pass�e en param�tre
	 * Retourne le nouveau total obtenu.
	 */
	int diviser(int operande);
	
	/**
	 * Retourne le total courant de la calculatrice
	 */
	int recupererTotal();

}

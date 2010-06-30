package fr.softeam.spring.service;

public interface ICalculatrice {

	/**
	 * Initialise la calculatrice. Remet à 0 le total
	 *
	 */
	void initialiser();
	
	/**
	 * Additionne la valeur passée en paramètre au total courant de la calculatrice
	 * Retourne le nouveau total obtenu.
	 */
	int additionner(int operande);

	/**
	 * Soustrait la valeur passée en paramètre au total courant de la calculatrice
	 * Retourne le nouveau total obtenu.
	 */
	int soustraire(int operande);
	
	/**
	 * Multiplie la valeur passée en paramètre avec le total courant de la calculatrice
	 * Retourne le nouveau total obtenu.
	 */
	int multiplier(int operande);
	
	/**
	 * Divise le total courant de la calculatrice par la valeur passée en paramètre
	 * Retourne le nouveau total obtenu.
	 */
	int diviser(int operande);
	
	/**
	 * Retourne le total courant de la calculatrice
	 */
	int recupererTotal();

}

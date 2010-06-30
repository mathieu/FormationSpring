package fr.softeam.spring.service;

public class CalculatriceImpl implements ICalculatrice {
	
	private int total;

	public int additionner(int operande) {
		
		total = operande + total;
		return total;
	}

	public int diviser(int operande) {

		total = total / operande;
		return total;
	}

	public void initialiser() {

		total = 0;

	}

	public int multiplier(int operande) {
		
		total = operande * total;
		
		return total;
	}

	public int recupererTotal() {

		return total;
	}

	public int soustraire(int operande) {
		
		total = total - operande;

		return total;
	}

}

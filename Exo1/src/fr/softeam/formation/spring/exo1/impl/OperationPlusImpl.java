package fr.softeam.formation.spring.exo1.impl;

public class OperationPlusImpl implements fr.softeam.formation.spring.exo1.IOperation {

	@Override
	public int calculer(int operande1, int operande2) {
		return operande1 + operande2;
	}

}

package fr.softeam.formation.spring.exo2.impl;

public class OperationPlusImpl implements fr.softeam.formation.spring.exo2.IOperation {

	@Override
	public Integer calculer(Integer operande1, Integer operande2) {
		return operande1 + operande2;
	}

}

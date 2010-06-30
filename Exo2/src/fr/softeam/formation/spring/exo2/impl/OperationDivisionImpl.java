package fr.softeam.formation.spring.exo2.impl;

import fr.softeam.formation.spring.exo2.IOperation;

public class OperationDivisionImpl implements IOperation {

	@Override
	public Integer calculer(Integer operande1, Integer operande2) {
		return operande1 / operande2;
	}	
}

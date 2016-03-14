package com.StateModel;

public class ConcreteStateB implements State {

	@Override
	public void handle(String sampleParameter) {

		System.out.println("ConcreteStateB handle £º" + sampleParameter);
	}

}
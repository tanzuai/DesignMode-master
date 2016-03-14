package com.DecorativeMode;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator() {
	}

	public ConcreteDecorator(Component component) {
		super(component);
	}

	public void operation() {
		this.addedOperation();
		super.operation();
	}

	public void addedOperation() {
		System.out.println("мМио");
	}
}

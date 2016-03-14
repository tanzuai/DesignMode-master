package com.IteratorModel;

import java.util.Vector;

public class ConcreteAggregat implements Aggregat {
	private Vector vector = null;

	public Vector getVector() {
		return vector;
	}

	public void setVector(final Vector vector) {
		this.vector = vector;
	}

	public ConcreteAggregat() {
		vector = new Vector();
		vector.add("vector 1");
		vector.add("vector 2");
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(vector);
	}
}

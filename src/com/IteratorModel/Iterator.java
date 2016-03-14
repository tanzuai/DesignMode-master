package com.IteratorModel;

public interface Iterator {
	public Object first();

	public Object next();

	public Object currentItem();

	public boolean isDone();
}
package com.IteratorModel;

public class IteratorModel {
	public static void test() {
		final Aggregat agg = new ConcreteAggregat();
		final Iterator iterator = agg.createIterator();
		System.out.println(iterator.first());
		while (!iterator.isDone()) {
			System.out.println(iterator.next());
		}
	}
}
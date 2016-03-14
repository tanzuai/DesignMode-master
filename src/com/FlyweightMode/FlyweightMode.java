package com.FlyweightMode;

public class FlyweightMode {//ÏíÔªÄ£Ê½

	public static void test() {
		// TODO Auto-generated method stub
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory(new Character('a'));
		fly.operation("First Call");

		fly = factory.factory(new Character('b'));
		fly.operation("Second Call");

		fly = factory.factory(new Character('a'));
		fly.operation("Third Call");
	}

}
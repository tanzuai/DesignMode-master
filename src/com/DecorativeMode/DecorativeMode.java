package com.DecorativeMode;

public class DecorativeMode {// 装饰模式
	public static void test() {
		Component component = new ConcreteComponent();
		Decorator decorator = new ConcreteDecorator(component);
		// 客户端不变, 但已增加了责任
		decorator.operation();
	}
}

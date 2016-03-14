package com.AbstractFactoryModel;

//定义不同的产品之间的一定具备的标准，用interface实现 
//其中的method()方法可看作提取出不同产品的共性，如手机都有类似的功能 
interface IProductA {
	public void method();
}

interface IProductB {
	public void method();
}

// 实现了产品标准实现的一系列具体产品
// 由于已经设计好A1由厂商1生产，故以下输出代码有“厂商x”
class ProductA1 implements IProductA {
	public void method() {
		System.out.println("厂商1    生产ProductA1 ...");
	}
}

class ProductA2 implements IProductA {
	public void method() {
		System.out.println("厂商2    生产ProductA2 ...");
	}
}

class ProductB1 implements IProductB {
	public void method() {
		System.out.println("厂商1    生产ProductB1 ...");
	}
}

class ProductB2 implements IProductB {
	public void method() {
		System.out.println("厂商2    生产ProductB2 ...");
	}
}

// 每一种牌子的产品生产工厂，即不同的厂商负责自己牌子产品的生产
abstract class Factory1 {
	abstract IProductA getProductA1();

	abstract IProductB getProductB1();
}

abstract class Factory2 {
	abstract IProductA getProductA2();

	abstract IProductB getProductB2();
}

// 具体的工厂用来生产相关的产品
class ConcreteFactoryA extends Factory1 {
	public IProductA getProductA1() {
		return new ProductA1();
	}

	public IProductB getProductB1() {
		return new ProductB1();
	}
}

class ConcreteFactoryB extends Factory2 {
	public IProductA getProductA2() {
		return new ProductA2();
	}

	public IProductB getProductB2() {
		return new ProductB2();
	}
}

// 测试类
public class AbstractFactoryModel {
	public static void test() {
		// 厂商1负责生产产品A1、B1
		Factory1 factory1 = new ConcreteFactoryA();
		IProductA productA1 = factory1.getProductA1();
		IProductB productB1 = factory1.getProductB1();

		productA1.method();
		productB1.method();

		// 厂商2负责生产产品A2、B2
		Factory2 factory2 = new ConcreteFactoryB();
		IProductA productA2 = factory2.getProductA2();
		IProductB productB2 = factory2.getProductB2();

		productA2.method();
		productB2.method();
	}
}
package com.AbstractFactoryModel;

//其中的method()方法可看作提取出不同产品的共性，如手机都有类似的功能
interface IProductC{
	public void method();
}

//每一种牌子的产品生产工厂，即不同的厂商负责自己牌子产品的生产
abstract class Factory3{
	abstract IProductC getProductC3();
}


//具体的工厂用来生产相关的产品
class ConcreteFactoryC extends Factory3{

	@Override
	IProductC getProductC3() {
		return new ProductC3();
	}
}

//实现了产品标准实现的一系列具体产品
//由于已经设计好C1由厂商1生产，故以下输出代码有“厂商x”
class ProductC3 implements IProductC {

	@Override
	public void method() {
		System.out.println("厂商3    生产ProductC3 ...");
	}
}

// 测试类
public class AbstractFactoryModel_Demo {
	public static void test() {
		// 厂商1负责生产产品A1
		Factory3 factory3 = new ConcreteFactoryC();
		IProductC productC3 = factory3.getProductC3();

		productC3.method();
	}
}
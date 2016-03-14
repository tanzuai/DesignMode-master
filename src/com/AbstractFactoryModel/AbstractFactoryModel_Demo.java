package com.AbstractFactoryModel;

//���е�method()�����ɿ�����ȡ����ͬ��Ʒ�Ĺ��ԣ����ֻ��������ƵĹ���
interface IProductC{
	public void method();
}

//ÿһ�����ӵĲ�Ʒ��������������ͬ�ĳ��̸����Լ����Ӳ�Ʒ������
abstract class Factory3{
	abstract IProductC getProductC3();
}


//����Ĺ�������������صĲ�Ʒ
class ConcreteFactoryC extends Factory3{

	@Override
	IProductC getProductC3() {
		return new ProductC3();
	}
}

//ʵ���˲�Ʒ��׼ʵ�ֵ�һϵ�о����Ʒ
//�����Ѿ���ƺ�C1�ɳ���1��������������������С�����x��
class ProductC3 implements IProductC {

	@Override
	public void method() {
		System.out.println("����3    ����ProductC3 ...");
	}
}

// ������
public class AbstractFactoryModel_Demo {
	public static void test() {
		// ����1����������ƷA1
		Factory3 factory3 = new ConcreteFactoryC();
		IProductC productC3 = factory3.getProductC3();

		productC3.method();
	}
}
package com.ChainOfResponsibilityModel;

public class ChainOfResponsibilityModel {

	public static void test() {
		// 组装责任链
		Handler handler1 = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler();
		handler1.setSuccessor(handler2);
		// 提交请求
		handler1.handleRequest();
	}

}

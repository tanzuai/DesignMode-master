package com.TemplateMethodModel;

public abstract class BaseTest {

	public void ask() {
		System.out.println("国内最牛的微博之一是？" + answer());
	}

	public abstract String answer();
}

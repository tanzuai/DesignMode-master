package com.BuilderMode;

public class BuilderMode {
	public static void test() {
		Cai cai = new ZhangSan();// 张三做菜
		Director d = new Director(cai); // 指挥者
		d.zuocai();// 我要指挥者弄菜，其实指挥者叫张三弄菜去了。
	}
}

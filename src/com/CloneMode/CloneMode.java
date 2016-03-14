package com.CloneMode;

public class CloneMode {
	public static void test() {
		AbstractMonkey a1 = new RealMonkey();
		AbstractMonkey a2 = (AbstractMonkey) a1.clone();
		AbstractMonkey a3 = (AbstractMonkey) a1.clone();
		// AbstractMonkey a3 = (AbstractMonkey) a2.clone();
		// 这里通过 a2 克隆自己也行，说明 a2 已经是一个真实在内
		// 存中的对象了
		a1.dothing();
		a2.dothing();
		a3.dothing();
	}
}

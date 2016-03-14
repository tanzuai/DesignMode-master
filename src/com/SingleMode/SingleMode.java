package com.SingleMode;

public class SingleMode {
	private static SingleMode mThisMode;

	// 已经自行实例化
	// private static final SingleMode mThisMode2 = new SingleMode();

	public static SingleMode getInstance() {// 懒汉式单例类
		if (mThisMode == null)
			mThisMode = new SingleMode();
		return mThisMode;
	}

	// public static SingleMode getInstance2() {// 饿汉式单例类
	// return mThisMode2;
	// }
}

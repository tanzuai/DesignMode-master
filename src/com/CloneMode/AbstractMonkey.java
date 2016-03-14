package com.CloneMode;

public abstract class AbstractMonkey implements Cloneable {
	// 本类相当于在孙悟空内部，他自造自己的一个地方
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}

	public abstract void dothing();
}

package com.IntermediaryModel;

abstract class AbstractColleague {
	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// 抽象方法，修改数字时同时修改关联对象
	public abstract void setNumber(int number, AbstractColleague coll);
}

class ColleagueA extends AbstractColleague {
	public void setNumber(int number, AbstractColleague coll) {
		this.number = number;
		coll.setNumber(number * 100);
	}
}

class ColleagueB extends AbstractColleague {

	public void setNumber(int number, AbstractColleague coll) {
		this.number = number;
		coll.setNumber(number / 100);
	}
}

public class Client {

}
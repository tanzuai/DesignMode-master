package com.IntermediaryModel;

public class IntermediaryModel {
	public static void test1() {

		AbstractColleague collA = new ColleagueA();
		AbstractColleague collB = new ColleagueB();

		System.out.println("==========设置A影响B==========");
		collA.setNumber(1288, collB);
		System.out.println("collA的number值：" + collA.getNumber());
		System.out.println("collB的number值：" + collB.getNumber());

		System.out.println("==========设置B影响A==========");
		collB.setNumber(87635, collA);
		System.out.println("collB的number值：" + collB.getNumber());
		System.out.println("collA的number值：" + collA.getNumber());
	}

	public static void test2() {
		AbstractColleague2 collA = new ColleagueA2();
		AbstractColleague2 collB = new ColleagueB2();

		AbstractMediator am = new Mediator(collA, collB);

		System.out.println("==========通过设置A影响B==========");
		collA.setNumber(1000, am);
		System.out.println("collA的number值为：" + collA.getNumber());
		System.out.println("collB的number值为A的10倍：" + collB.getNumber());

		System.out.println("==========通过设置B影响A==========");
		collB.setNumber(1000, am);
		System.out.println("collB的number值为：" + collB.getNumber());
		System.out.println("collA的number值为B的0.1倍：" + collA.getNumber());

	}
}

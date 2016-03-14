package com.VisitorMode;

public class VisitorMode {

	public void ride(Horse h) {
		System.out.println("ÆïÂí");
	}

	public void ride(WhiteHorse wh) {
		System.out.println("Æï°×Âí");
	}

	public void ride(BlackHorse bh) {
		System.out.println("ÆïºÚÂí");
	}

	public static void test() {
		Horse wh = new WhiteHorse();
		Horse bh = new BlackHorse();
		VisitorMode mozi = new VisitorMode();
		mozi.ride(wh);
		mozi.ride(bh);
	}

}
package com.BuilderMode;

public class Director {
	Cai cai;

	public Director(Cai cai) {
		this.cai = cai;
	}

	public void zuocai() {
		cai.fangyan();
		cai.fangyou();
		cai.jiashui();
	}
}

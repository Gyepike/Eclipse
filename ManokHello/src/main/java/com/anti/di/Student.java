package com.anti.di;

public class Student {
		
    private Cheat cheat;

	
	public Cheat getCheat() {
		return cheat;
	}


	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}


	public void cheat() {
		cheat.cheat();
	}
}

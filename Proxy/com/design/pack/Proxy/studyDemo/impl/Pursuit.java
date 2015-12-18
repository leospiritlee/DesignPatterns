package com.design.pack.Proxy.studyDemo.impl;

import com.design.pack.Proxy.studyDemo.GiveGift;
import com.design.pack.Proxy.studyDemo.bean.Girl;

public class Pursuit implements GiveGift {

	private Girl girl;
	
	public Pursuit() {
		
	}
	
	public Pursuit(Girl girl) {
		this.girl = girl;
	}

	@Override
	public void GiveDolls() {
		System.out.println(girl.getGirlName() + ": GiveDolls");
	}

	@Override
	public void GiveFlowers() {
		System.out.println(girl.getGirlName() + ": GiveFlowers");
	}

	@Override
	public void GiveChocolate() {
		System.out.println(girl.getGirlName() + ": GiveChocolate");
	}

}

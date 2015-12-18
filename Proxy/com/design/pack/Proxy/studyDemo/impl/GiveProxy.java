package com.design.pack.Proxy.studyDemo.impl;

import com.design.pack.Proxy.studyDemo.GiveGift;
import com.design.pack.Proxy.studyDemo.bean.Girl;

public class GiveProxy implements GiveGift {

	private Pursuit pursuit;
	
	public GiveProxy() {
		
	}
	
	public GiveProxy(Girl girl) {
		pursuit = new Pursuit(girl);
	}
	

	@Override
	public void GiveDolls() {
		pursuit.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		pursuit.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		pursuit.GiveChocolate();
	}

}

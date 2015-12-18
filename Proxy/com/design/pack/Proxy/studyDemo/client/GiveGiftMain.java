package com.design.pack.Proxy.studyDemo.client;

import com.design.pack.Proxy.studyDemo.GiveGift;
import com.design.pack.Proxy.studyDemo.bean.Girl;
import com.design.pack.Proxy.studyDemo.impl.GiveProxy;

public class GiveGiftMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Girl girl = new Girl();
		girl.setGirlName("女孩A");
		
		GiveProxy giveProxy = new GiveProxy(girl);
	
		giveProxy.GiveChocolate();
		giveProxy.GiveDolls();
		giveProxy.GiveFlowers();
		
		girl.setGirlName("女孩B");
		GiveGift giveGift = new GiveProxy(girl);
		giveGift.GiveChocolate();
		giveGift.GiveDolls();
		giveGift.GiveFlowers();
	}

}

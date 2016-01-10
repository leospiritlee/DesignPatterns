package com.design.pack.Chain.impl;

import com.design.pack.Chain.Handler;

public class ConcreteHandlerC extends Handler {

	@Override
	public void HandleRequest(int request) {

		if(request >=20 && request < 30){
			System.out.println( "处理请求C" + request);
		}else if(this.successorHandler != null){
			successorHandler.HandleRequest(request);
		}
	}

}

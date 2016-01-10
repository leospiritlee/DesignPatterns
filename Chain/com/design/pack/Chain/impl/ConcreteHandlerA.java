package com.design.pack.Chain.impl;

import com.design.pack.Chain.Handler;

public class ConcreteHandlerA extends Handler {

	@Override
	public void HandleRequest(int request) {

		if(request >=0 && request < 10){
			System.out.println("处理请求A" + request);
		}else if(this.successorHandler != null){
			successorHandler.HandleRequest(request);
		}
	}

}

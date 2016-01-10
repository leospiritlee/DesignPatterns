package com.design.pack.Chain.impl;

import com.design.pack.Chain.Handler;

public class ConcreteHandlerB extends Handler {

	@Override
	public void HandleRequest(int request) {

		if(request >=10 && request < 20){
			System.out.println("处理请求B" + request);
		}else if(this.successorHandler != null){
			successorHandler.HandleRequest(request);
		}
	}

}

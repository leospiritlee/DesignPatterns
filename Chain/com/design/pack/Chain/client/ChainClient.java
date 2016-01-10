package com.design.pack.Chain.client;

import com.design.pack.Chain.Handler;
import com.design.pack.Chain.impl.ConcreteHandlerA;
import com.design.pack.Chain.impl.ConcreteHandlerB;
import com.design.pack.Chain.impl.ConcreteHandlerC;

public class ChainClient {

	public static void main(String[] args) {

		
		Handler handler_A = new ConcreteHandlerA();
		Handler handler_B = new ConcreteHandlerB();
		Handler handler_C = new ConcreteHandlerC();
		
		handler_A.setSuccessorHandler(handler_B);
		handler_B.setSuccessorHandler(handler_C);
		
		int[] requests = {2,5,14,22,18,3,27,20};
		
		for(int request : requests){
			handler_A.HandleRequest(request);
		}
	}

}

package com.design.pack.Factory.factory;

import com.design.pack.Factory.IFactory;
import com.design.pack.Factory.impl.AddFactory;
import com.design.pack.Factory.impl.DivFactory;
import com.design.pack.Factory.impl.MulFactory;
import com.design.pack.Factory.impl.SubFactory;
import com.design.pack.SimpleFactory.Operation;

public class OperationFactoryClient {

	
	public static Operation createOperation(char operate){
		
		IFactory iFactory   = null;
		switch (operate) {
		case '+':
			iFactory = new AddFactory();
			break;
		case '-':
			iFactory = new SubFactory();
			break;
		case '*':
			iFactory = new MulFactory();
			break;
		case '/':
			iFactory = new DivFactory();
			break;
		default:
			break;
		}
		return iFactory.createOperation();
	}
	
}

package com.design.pack.SimpleFactory.factory;

import com.design.pack.SimpleFactory.Operation;
import com.design.pack.SimpleFactory.impl.OperationAdd;
import com.design.pack.SimpleFactory.impl.OperationDiv;
import com.design.pack.SimpleFactory.impl.OperationMul;
import com.design.pack.SimpleFactory.impl.OperationSub;

public class OperationFactory {

	
	public static Operation createOperation(char operate){
		
		Operation operation = null;
		switch (operate) {
		case '+':
			operation = new OperationAdd();
			break;
		case '-':
			operation = new OperationSub();
			break;
		case '*':
			operation = new OperationMul();
			break;
		case '/':
			operation = new OperationDiv();
			break;
		default:
			break;
		}
		return operation;
	}
	
}

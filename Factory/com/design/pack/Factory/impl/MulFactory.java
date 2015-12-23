package com.design.pack.Factory.impl;

import com.design.pack.Factory.IFactory;
import com.design.pack.SimpleFactory.Operation;
import com.design.pack.SimpleFactory.impl.OperationMul;

public class MulFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}
	
}

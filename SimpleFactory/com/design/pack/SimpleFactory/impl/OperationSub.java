package com.design.pack.SimpleFactory.impl;

import com.design.pack.SimpleFactory.Operation;

public class OperationSub extends Operation{

	@Override
	public double GetResult() {
		double result = 0;
		result = getNumA() - getNumB();
		return result;
	}
	
}
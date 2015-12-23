package com.design.pack.SimpleFactory.impl;

import com.design.pack.SimpleFactory.Operation;

public class OperationDiv extends Operation{

	@Override
	public double GetResult() {
		double result = 0;
		if(getNumB() == 0){
			try {
				throw new Exception("除数不能为0");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		result = getNumA() / getNumB();
		return result;
	}
	
}
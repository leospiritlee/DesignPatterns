package com.design.pack.SimpleFactory.client;

import com.design.pack.SimpleFactory.Operation;
import com.design.pack.SimpleFactory.factory.OperationFactory;

public class OperationClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Operation operation = null;
		operation = OperationFactory.createOperation('/');
		operation.setNumA(1);
		operation.setNumB(5);
		double result = operation.GetResult();
		System.out.println(result);
		
		
	}

}

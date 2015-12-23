package com.design.pack.Factory.client;

import com.design.pack.Factory.IFactory;
import com.design.pack.Factory.factory.OperationFactoryClient;
import com.design.pack.Factory.impl.AddFactory;
import com.design.pack.SimpleFactory.Operation;

public class FactoryClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//第一版本 客户端直接调用工厂接口 如果需要不同的调用需要修改 客户端
		IFactory iFactory = new AddFactory();
		Operation operation = iFactory.createOperation();
		operation.setNumA(1);
		operation.setNumB(2);
		double result = operation.GetResult();
		System.out.println(result);
		
		//第二版  依旧保持简单工厂模式暴露给客户端一个标准接口，后续修改，新增都不影响客户端的调用
		Operation operation_B = OperationFactoryClient.createOperation('*');
		operation_B.setNumA(1);
		operation_B.setNumB(2);
		double result_B = operation_B.GetResult();
		System.out.println(result_B);
		
	}

}

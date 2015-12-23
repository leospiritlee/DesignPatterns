package com.design.pack.Strategy.client;

/**
 * 客户端调用实例
 * @author leospiritlee
 *
 */
public class StrategyMain {

	public static void main(String[] args) {

		ContextStrategyClient client = new ContextStrategyClient(1);
		client.getResult();
		
		
	}

}

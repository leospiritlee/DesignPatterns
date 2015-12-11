package com.design.pack.Strategy.client;

import com.design.pack.Strategy.Strategy;
import com.design.pack.Strategy.impl.StrategyA;
import com.design.pack.Strategy.impl.StrategyB;
import com.design.pack.Strategy.impl.StrategyC;

/**
 * 策略服务对外提供客户端
 * @author leospiritlee
 *
 */
public class ContextStrategyClient {

	private Strategy strategy;
	
	public ContextStrategyClient(int type){
		switch (type) {
		case 1:
			strategy = new StrategyA();
			break;
		case 2:
			strategy = new StrategyB();
			break;
		case 3:
			strategy = new StrategyC();
			break;
		
		default:
			break;
		}
	}
	
	public void getResult(){
		strategy.CalculationResult();
	}
}

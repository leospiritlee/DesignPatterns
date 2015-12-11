package com.design.pack.Decorator.impl;

import com.design.pack.Decorator.Decorator;

public class ConcreteDecoratorA  extends Decorator{

	private String desc;
	
	public void Operation(){
		super.Operation();
		desc = "装饰A描述";
		System.out.println(desc + "装饰类A的具体操作" );
	}
	
	
	
}

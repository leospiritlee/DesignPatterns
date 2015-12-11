package com.design.pack.Decorator.impl;

import com.design.pack.Decorator.Decorator;

public class ConcreteDecoratorB extends Decorator {

	public void Operation() {
		super.Operation();
		this.DiffWithDecoratorA();
		System.out.println("装饰类B的具体操作");
	}

	private void DiffWithDecoratorA() {
		System.out.println("区别装饰A的方法");
	}

}

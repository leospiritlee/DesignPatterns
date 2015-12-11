package com.design.pack.Decorator.client;

import com.design.pack.Decorator.ConcreteComponent;
import com.design.pack.Decorator.impl.ConcreteDecoratorA;
import com.design.pack.Decorator.impl.ConcreteDecoratorB;

/**
 * 装饰模式 客户端代码
 * @author leospiritlee
 * 装饰模式不需要有固定的顺序，只需要关注本对象的功能，不需要关注如何被添加到对象链中
 *
 */
public class DecoratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConcreteComponent component  = new ConcreteComponent();
		
		ConcreteDecoratorA cDecoratorA = new ConcreteDecoratorA();
		
		ConcreteDecoratorB cDecoratorB = new ConcreteDecoratorB();
		
		cDecoratorA.setComponent(component);
		cDecoratorB.setComponent(cDecoratorA);
		
		cDecoratorB.Operation();
		
	}

}

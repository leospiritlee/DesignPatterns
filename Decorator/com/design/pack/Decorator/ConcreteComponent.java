package com.design.pack.Decorator;

/**
 * 
 * @author leospiritlee
 * ConcreteComponent是定义一个具体的的对象，也可以给这个对象添加一些职责。
 */
public class ConcreteComponent extends Component {

	@Override
	public void Operation() {
		System.out.println("具体实现");
	}

}

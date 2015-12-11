package com.design.pack.Decorator;

/**
 * 
 * @author leospiritlee
 *  Decorator装饰抽象类，继承了 Component，从外类扩展Component的功能，但对于Component来说
 *  是无需知道Decorator的存在。
 */
public abstract class Decorator extends Component {

	protected Component component;
	
	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void Operation() {
		if(component != null){
			component.Operation();
		}
	}

}

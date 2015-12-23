package com.design.pack.Prototype.client;

import com.design.pack.Prototype.impl.ConcretePrototype;

/**
 * 
 * @author leospiritlee
 *
 */
public class PrototypeClient {

	
	public static void main(String[] args) {

		ConcretePrototype concretePrototype_A = new ConcretePrototype("A_result");
		System.out.println(concretePrototype_A.getId());
		
		ConcretePrototype concretePrototype_B = (ConcretePrototype) concretePrototype_A.Clone();
		
		concretePrototype_B = new ConcretePrototype("B_result");
		
		System.out.println(concretePrototype_B.getId());
	}

}

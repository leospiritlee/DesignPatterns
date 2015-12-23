package com.design.pack.Prototype.impl;

import com.design.pack.Prototype.Prototype;

public class ConcretePrototype extends Prototype implements Cloneable{

	public ConcretePrototype(String id) {
		super(id);
	}

	@Override
	public Prototype Clone() {
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}

}

package com.design.pack.Proxy.impl;

import com.design.pack.Proxy.Subject;

public class Proxy extends Subject {

	RealSubject realSubject;
	
	@Override
	public void request() {
		
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}

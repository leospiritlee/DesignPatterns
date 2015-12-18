package com.design.pack.Proxy.impl;

import com.design.pack.Proxy.Subject;

public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("真实的请求-实际处理逻辑");
	}
	
}

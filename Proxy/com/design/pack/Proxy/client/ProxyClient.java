package com.design.pack.Proxy.client;

import com.design.pack.Proxy.Subject;
import com.design.pack.Proxy.impl.Proxy;

public class ProxyClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Proxy proxy = new Proxy();
		
		proxy.request();
		
		
		Subject subject = new Proxy();
		
		subject.request();
		
	}

}

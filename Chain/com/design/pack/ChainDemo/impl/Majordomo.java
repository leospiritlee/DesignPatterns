package com.design.pack.ChainDemo.impl;

import com.design.pack.ChainDemo.Manager;
import com.design.pack.ChainDemo.Request;

public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void RequestApplications(Request request) {
		if(request.getRequestType() == "请假" && request.getNum() <=5){
			System.out.println(name +" : 批准" + request.getRequestType() + "--" + request.getRequestContent() + "--" + request.getNum());
		}
		else{
			if(superior != null){
				superior.RequestApplications(request);
			}
		}
	}


}

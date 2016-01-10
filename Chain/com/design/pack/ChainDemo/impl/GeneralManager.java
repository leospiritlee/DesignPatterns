package com.design.pack.ChainDemo.impl;

import com.design.pack.ChainDemo.Manager;
import com.design.pack.ChainDemo.Request;

public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void RequestApplications(Request request) {
		if(request.getRequestType() == "请假"){
			System.out.println(name +" : 批准" + request.getRequestType() + "--" + request.getRequestContent() + "--" + request.getNum());
		}else if(request.getRequestType() == "加薪" && request.getNum() <= 500){
			System.out.println(name +" : 批准" + request.getRequestType() + "--" + request.getRequestContent() + "--" + request.getNum());
		}else if(request.getRequestType() == "加薪" && request.getNum() > 500){
			System.out.println(name +" : 需要考虑" + request.getRequestType() + "--" + request.getRequestContent() + "--" + request.getNum());
		}else{
			if(superior != null){
				superior.RequestApplications(request);
			}
		}
	}


}

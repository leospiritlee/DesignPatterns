package com.design.pack.ChainDemo.client;

import com.design.pack.ChainDemo.Request;
import com.design.pack.ChainDemo.impl.CommonManager;
import com.design.pack.ChainDemo.impl.GeneralManager;
import com.design.pack.ChainDemo.impl.Majordomo;

public class ChainDemoClient {

	public static void main(String[] args) {

		CommonManager commonManager = new CommonManager("Jack");
		Majordomo majordomo = new Majordomo("Mike");
		GeneralManager generalManager = new GeneralManager("Leo");
		
		commonManager.setSuperior(majordomo);
		majordomo.setSuperior(generalManager);
		
		Request request_A = new Request();
		request_A.setRequestType("请假");
		request_A.setNum(2);
		request_A.setRequestContent("请假两天");
		commonManager.RequestApplications(request_A);
		
		
		Request request_B = new Request();
		request_B.setRequestType("请假");
		request_B.setNum(4);
		request_B.setRequestContent("请假4天");
		commonManager.RequestApplications(request_B);
		
		
		Request request_C = new Request();
		request_C.setRequestType("加薪");
		request_C.setNum(400);
		request_C.setRequestContent("加薪400");
		commonManager.RequestApplications(request_C);
		
		Request request_D = new Request();
		request_D.setRequestType("加薪");
		request_D.setNum(600);
		request_D.setRequestContent("加薪600");
		commonManager.RequestApplications(request_D);
		
		
	}

}

package com.design.pack.Prototype.demo.client;

import com.design.pack.Prototype.demo.Resume;

/**
 * 原型模式调用客户端
 * @author leospiritlee
 *
 */
public class ResumeClient {

	
	public static void main(String[] args) {

		Resume resume_A = new Resume("A");
		resume_A.setPersonalInfo("20", "male");
		resume_A.setWorkInfo("first workInfo");
		
		Resume resume_B = resume_A.Clone();
		resume_B.setWorkInfo("second workInfo");
		
		Resume resume_C = resume_A.Clone();
		
		resume_A.Display();
		resume_B.Display();
		resume_C.Display(); //not set workInfo for resume_C
		
	}

}

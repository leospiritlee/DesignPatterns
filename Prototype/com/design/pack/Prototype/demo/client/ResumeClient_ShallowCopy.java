package com.design.pack.Prototype.demo.client;

import com.design.pack.Prototype.demo.Resume_ShallowCopy;

/**
 * 浅复制 调用客户端
 * @author leospiritlee
 *
 */
public class ResumeClient_ShallowCopy {

	
	public static void main(String[] args) {

		Resume_ShallowCopy resume_A = new Resume_ShallowCopy("A");
		resume_A.setPersonalInfo("20", "male");
		resume_A.setWorkInfo("first_workInfo");	
				
		Resume_ShallowCopy resume_B = resume_A.Clone();
		resume_B.setWorkInfo("second_workInfo");
		
		Resume_ShallowCopy resume_C = resume_A.Clone();
		resume_C.setWorkInfo("Third_workInfo");
		
		resume_A.Display();
		resume_B.Display();
		resume_C.Display();
	}

}

package com.design.pack.Prototype.demo;

public class Resume_ShallowCopy implements Cloneable{

	private String name;
	private String sex;
	private String age;
	
	private WorkInfo_ShallowCopy workInfo;
	
	public Resume_ShallowCopy(String name){
		this.name = name;
		workInfo = new WorkInfo_ShallowCopy();
	}
	
	public void setPersonalInfo(String age,String sex){
		this.age = age;
		this.sex = sex;
	}
	
	public void setWorkInfo(String workInfo){
		this.workInfo.setWorkInfo(workInfo);
	}
	
	public void Display(){
		System.out.print("name : " + name);
		System.out.print("sex : " + sex);
		System.out.print("age : " + age);
		System.out.print("\n");
		System.out.println("workInfo : " + workInfo.getWorkInfo());
	}
	
	public Resume_ShallowCopy Clone(){
		Resume_ShallowCopy resume = null;
		try {
			resume = (Resume_ShallowCopy) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return resume;
	}
	
}

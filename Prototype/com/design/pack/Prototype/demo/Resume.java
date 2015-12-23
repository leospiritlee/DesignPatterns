package com.design.pack.Prototype.demo;


public class Resume implements Cloneable {

	private String name;
	private String sex;
	private String age;
	
	private String workInfo;
	
	public Resume(String name){
		this.name = name;
	}
	
	public void setPersonalInfo(String age,String sex){
		this.age = age;
		this.sex = sex;
	}
	
	public void setWorkInfo(String workInfo){
		this.workInfo = workInfo;
	}
	
	public void Display(){
		System.out.print("name : " + name);
		System.out.print("sex : " + sex);
		System.out.print("age : " + age);
		System.out.print("\n");
		System.out.println("workInfo : " + workInfo);
	}
	
	public Resume Clone(){
		Resume resume = null;
		try {
			resume = (Resume) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return resume;
	}
}

package com.design.pack.Prototype.demo;


public class Resume_DeepCopy implements Cloneable {

	private String name;
	private String sex;
	private String age;
	
	private WorkInfo_DeepCopy workInfo;
	
	public Resume_DeepCopy(String name){
		this.name = name;
		this.workInfo = new WorkInfo_DeepCopy();
	}
	
	private Resume_DeepCopy(WorkInfo_DeepCopy workInfo){
		this.workInfo = workInfo.Clone();
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
	
	public Resume_DeepCopy Clone(){
		Resume_DeepCopy resume = new Resume_DeepCopy(this.workInfo);
		resume.name = this.name;
		resume.age = this.age;
		resume.sex = this.sex;
		return resume;
	}
}

package com.design.pack.Prototype.demo;

public class WorkInfo_DeepCopy implements Cloneable{

	String workInfo;

	public String getWorkInfo() {
		return workInfo;
	}

	public void setWorkInfo(String workInfo) {
		this.workInfo = workInfo;
	}
	
	public WorkInfo_DeepCopy Clone(){
		WorkInfo_DeepCopy workInfo_DeepCopy = null;
		
		try {
			workInfo_DeepCopy = (WorkInfo_DeepCopy) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return workInfo_DeepCopy;
	}
	
}


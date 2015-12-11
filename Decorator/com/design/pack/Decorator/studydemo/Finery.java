package com.design.pack.Decorator.studydemo;

public class Finery extends Person {

	protected Person person;
	
	public void Decorate(Person person){
		this.person = person;
	}
	
	public void show(){
		if(person != null){
			person.show();
		}
	}
	
	
}

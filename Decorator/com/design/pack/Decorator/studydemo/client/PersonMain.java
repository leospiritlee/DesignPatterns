package com.design.pack.Decorator.studydemo.client;

import com.design.pack.Decorator.studydemo.Person;
import com.design.pack.Decorator.studydemo.impl.Shoes;
import com.design.pack.Decorator.studydemo.impl.Tshirt;

public class PersonMain {

	public static void main(String[] args) {

		Person person = new Person("test");
		
		System.out.println("第一种装扮：");
		
		Tshirt tshirt = new Tshirt();
		Shoes shoes = new Shoes();
		tshirt.Decorate(person);
		shoes.Decorate(tshirt);
		shoes.show();
		
		
	}
}

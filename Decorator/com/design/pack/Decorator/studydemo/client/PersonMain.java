package com.design.pack.Decorator.studydemo.client;

import com.design.pack.Decorator.studydemo.Person;
import com.design.pack.Decorator.studydemo.impl.Shoes;
import com.design.pack.Decorator.studydemo.impl.Tshirt;

public class PersonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person person = new Person("test");
		
		System.out.println("第一种装扮：");
		
		Tshirt tshirt = new Tshirt();
		Shoes shoes = new Shoes();
		shoes.Decorate(person);
		tshirt.Decorate(shoes);
		tshirt.show();
		
		
	}
}

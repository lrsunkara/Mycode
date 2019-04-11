package com.javapresentation.test;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Dog is barking  Woof Woof");
	super.bark();
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breed = "Hasky";
		dog.name = "Chitti";
		Animal.age = 7;
		Animal.colour = "Brown";
		System.out.println("Dog name is :" + dog.name + " Dog breed is :" + dog.breed + " Dog age :" + Animal.age
				+ " Dog colour :" + Animal.colour);
		dog.bark();//Overriding parent
		
		Animal.run();// calling static method in parent
		dog.greet("Karenkelly");// overloading
		dog.greet("Sri", "Sunkara");//overloading

	}

	public void greet(String name) {
		System.out.println(" Greetings for "+ name);
	}
	
	public void greet(String fname, String lname) {
		System.out.println(" Greetings for..."  + fname  +  lname ) ;
	}
	
	
	
	
	
	
}

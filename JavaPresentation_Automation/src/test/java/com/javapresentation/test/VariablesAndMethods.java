package com.javapresentation.test;

public class VariablesAndMethods {
	//States of objects
	static String name;// static variable
	int age; // instance variable
	String sex;
	String color;
	//Behavior of the objets
	public String getInfo() {
		
		sex= "Female";
		age = 20;
		color = "Fair";
		return ("Student's name is : " + name + " and colour " + color + " Age is:" + age + " sex :" + sex);
	}
	public void eating() {
		name= "John";
		sex = "Male";
		System.out.println(name + " eating Pizza !!!");
		
	}
	public void running() {
		name= "Sophie";//static variable from class level
		String myString = "I am a Student";// local variable
		System.out.println( "My name is " + name + " and " + myString + "!!!");
	}
	public static void playing() {
		
		System.out.println("Playing whole day !!!");
	}

	public static void main(String[] args) {
		VariablesAndMethods student = new VariablesAndMethods();
		
		VariablesAndMethods.name = "Marie";//calling instance static variable
		
		System.out.println(student.getInfo());
		student.eating();
		student.running();
		playing();//this is a static method
	}
	

}

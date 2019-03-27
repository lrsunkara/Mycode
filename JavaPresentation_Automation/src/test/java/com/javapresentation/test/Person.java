package com.javapresentation.test;

abstract class Person {
	public String pFName = "John";
	private int pAge = 20;
	public String pFavFood = "Pizza";
	
	public abstract void study(); // abstract method
	public abstract void sleeping(); 
		
	
	public void drawing() {// concrete method

		System.out.println(pFName + " is drawing ");
	}
	public void setAge(int age) {
		
		pAge = age;
		
	}

	public int getAge() {

		return pAge;
	}

	
	public Person() {

	}

	public  Person(String cFName, int cAge, String cFavFood) {
		System.out.println("Student Name: " + pFName + " Favfood: " + pFavFood);
		pFName = cFName;
		this.setAge(cAge);
		pFavFood = cFavFood;
		
	
	}

}

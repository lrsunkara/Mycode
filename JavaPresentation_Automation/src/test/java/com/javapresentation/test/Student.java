package com.javapresentation.test;

public class Student extends Person {
	
	public int graduationYear = 2019;
	
	public Student() {
		System.out.println("Student Name: " + pFName + " Favfood: " + pFavFood);
	}
	
	public void study() { // the body of the abstract method is provided here
		System.out.println("Studying all day long");
	}
	public void sleeping() {
		System.out.println("Sleeping late lastnight");
	}
	
	public Student (String fname1, int age1, String favFood1, int i){
		
		//super(fname1, age1, favFood1);
		
	System.out.println("Student Name: " + pFName + " Favfood: " + pFavFood);
		
	}

	public static void main(String[] args) {
		//Student myObj = new Student();
		Student myObj1 = new Student("Sri", 25, "Roti", 101);
		myObj1.study();
		System.out.println("Name: " +  myObj1.pFName + ", " + myObj1.getAge());
		System.out.println("Graduation Year: " + myObj1.graduationYear);
		myObj1.sleeping();
		myObj1.drawing();// calling from parent class
		
	}
}

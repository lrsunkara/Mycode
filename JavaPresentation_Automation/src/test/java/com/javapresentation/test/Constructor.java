package com.javapresentation.test;

public class Constructor {
	String firstName;
	String lastName;
	int id;

	public Constructor() {

	}

	public Constructor(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	
	}

	public Constructor(String fName, String lName, int i) {
		firstName = fName;
		lastName = lName;
		id = i;
	}

	public void getInfo() {
		System.out.println(" Student name " + firstName + lastName + id);
	}

	public static void main(String[] args) {

		Constructor obj = new Constructor(" Jayanth ", " Sunkara ");
		Constructor obj1 = new Constructor("Jay ", " Sun ", 101);
		obj.getInfo();
		obj1.getInfo();
	}

}

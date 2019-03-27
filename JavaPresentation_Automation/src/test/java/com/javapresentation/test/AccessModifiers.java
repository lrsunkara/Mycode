package com.javapresentation.test;

public class AccessModifiers {

static void defaultMethod() { // can avaliable in the same package
	System.out.println("Testing default method !!!");
}

public static void publicMethod() { // can avaliabe everywhere
	System.out.println("Teasting publicmethod !!!");
}

static private void privateMethod() { // avaliable only with in the class
	System.out.println("Testing private method");
}


static protected void protectedMethod() {
	//avaliable in subclass different package

	System.out.println("Testing protected method!!!");
}

public static void main(String[] args) {
	privateMethod();
	defaultMethod();
	publicMethod();
	protectedMethod();
}
}

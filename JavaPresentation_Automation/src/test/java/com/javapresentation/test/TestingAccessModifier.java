package com.javapresentation.test;

public class TestingAccessModifier {

	public void testingAccessModifierMethod() {

	}

	public static void main(String[] args) {

		AccessModifiers.defaultMethod();// avaliable in same package
		AccessModifiers.publicMethod();
		AccessModifiers.protectedMethod();
		 //AccessModifiers.//No access for private

	}

}

package com.javapresentation;

import com.javapresentation.test.AccessModifiers;

public class CallAccessModifier extends AccessModifiers {


public void testingAccessModifier() {
	
}


public static void main(String[] args) {
	AccessModifiers.publicMethod();// public method can access from different package
	AccessModifiers.protectedMethod();//By extends the AccessModifiers class able to access the protected
	//AccessModifiers. can not access the private or default from another package.
}



}

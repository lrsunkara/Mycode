package com.javapresentation.test;

public class TestEncapsulation {

	 public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Sai");
         obj.setEmpAge(41);
         obj.setEmpSSN(11223344);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    }
	
	
	
	
	
	
	
	
	
	
	
	
}

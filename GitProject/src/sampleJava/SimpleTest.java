package sampleJava;

import java.util.ArrayList;
import java.util.Iterator;
public class SimpleTest {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		
		Iterator  itr = arrayList.iterator();
		
		System.out.println("Iterating through ArrayList elements...");
		while(itr.hasNext()) {
			 System.out.println(itr.next());
			   	
		}
	
	int limit = 50;
	for(int i =0;i<limit;i++) {
		if(i%2==0) {
			System.out.println("The value of i is Even number..."+ i);
		} else {
			System.out.println("The value of i os odd number..."+ i);
		}
	}
	
	
	
	
	
	}

}

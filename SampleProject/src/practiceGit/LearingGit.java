package practiceGit;

import java.util.ArrayList;
import java.util.Collections;

public class LearingGit {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("1");
		arrayList.add("7");
		arrayList.add("3");
		arrayList.add("9");
		arrayList.add("5");
	//arrayList.set(3, "Replaced"); This is for replace the one index
		//arrayList.clear(); this is for clear the arrayList
		//Collections.sort(arrayList); this is for sort the index
		 arrayList.add(1,"INSERTED ELEMENT");
		System.out.println("ArrayList contains..");
		for(int i = 0;i<arrayList.size();i++) {
			System.out.println("Lakshmi:" + arrayList.get(i));
		}
	
	
	}

}

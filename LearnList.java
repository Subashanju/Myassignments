package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Arun");
		list.add("Deepa");
		list.add("Maria");
		list.add("Deepa");
		list.add("Muthu");
		list.add("Raju");
		System.out.println("Name starts with M:");
		for (String eachname:list) {
			if (eachname.startsWith("M")) {
				System.out.println(eachname);
			}
			
		}
	}

}

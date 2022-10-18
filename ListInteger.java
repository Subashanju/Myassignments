package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = new ArrayList<Integer>();
		number.add(23);
		number.add(54);
		number.add(67);
		number.add(55);
		number.add(66);
		number.add(42);
		number.add(27);
		number.add(89);
		System.out.println("Print Odd numbers: ");
		for (int oddnumber:number) {
			if (oddnumber % 2 != 0) {
				System.out.println(oddnumber);
			}
			
		
	}
	}
}



package assignment.week1;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] data = {3,2,11,4,6,7};
     Arrays.sort(data);
     System.out.println("Second largest number: " + data[data.length -2]);
	}

}

package week1.day1;

import week1.day2.MethodCar;

public class AccessModifier {
	public static void main(String[] args) {
		MethodCar obj = new MethodCar();
		obj.printCarName();
		String name = obj.getCarName();
		System.out.println(name);
		int regnum = obj.getRegNumber();
		System.out.println(regnum);
		String carcolor = obj.getCarColor();
		System.out.println(carcolor);
		boolean isCarPuncture = obj.isCarPuncture();
		System.out.println(isCarPuncture);
		int addNumbers = obj.addNumbers(5, 6, 7);
		System.out.println(addNumbers);
		int divNumbers = obj.divNumbers(10, 2);
		System.out.println(divNumbers);
		
	}
	
}

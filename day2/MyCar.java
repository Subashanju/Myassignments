package week1.day2;

public class MyCar {
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
		float multiNumbers = obj.multiNumbers(3, 4, 5);
		System.out.println(multiNumbers);
	}
}

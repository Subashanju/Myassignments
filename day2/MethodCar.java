package week1.day2;

public class MethodCar {
	
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
			int subTwoNumbers = obj.subTwoNumbers(6, 7);
			System.out.println(subTwoNumbers);
			int divNumbers = obj.divNumbers(10, 2);
			System.out.println(divNumbers);
			float multiNumbers = obj.multiNumbers(3, 4, 5);
			System.out.println(multiNumbers);
		}
	
public void printCarName() {
	System.out.println("MG");	
}
public String getCarName(){
	String name = "BMW";
	return name;
}
public int getRegNumber() {
	int regNumber = 1919;
	return regNumber;
}
public String getCarColor() {
	String carColor = "Blue";
	return carColor;
}
public boolean isCarPuncture() {
	boolean carPuncture = false;
	return carPuncture;
}
public int addNumbers(int num1,int num2,int num3) {
	int sum = num1+num2+num3;
	return sum;
}
private int subTwoNumbers(int num1,int num2) {
	int sub = num1-num2;
	return sub;
}
public int divNumbers (int a, int b) {
	int div = a / b;
	return div;
}
 float multiNumbers (float a,float b, float c) {
	float multi = a * b* c;
	return multi;
}
}
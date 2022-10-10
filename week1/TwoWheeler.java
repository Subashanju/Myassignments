package assignment.week1;

import cucumber.api.cli.Main;

public class TwoWheeler {
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		int Wheels = obj.noOfWheels();
		System.out.println("Wheels: " + Wheels);
		String name = obj.bikeName();
		System.out.println("Bike Name: " + name);
		long chassNumber = obj.chassIsNumber();
		System.out.println("Chass Number: " + chassNumber);
		boolean isPunctured = obj.isPunctured();
		System.out.println("Is Punctured: " + isPunctured);
		short mirrors = obj.noOfMirrors();
		System.out.println("No Of Mirrors: " + mirrors);
		double runningKm = obj.runningKM();
		System.out.println("KM: " + runningKm);
	}
public int noOfWheels() {
	int noOfWheels = 4;
	return noOfWheels;
}
public short noOfMirrors() {
	short mirrors = 2;
	return mirrors;
}
public long chassIsNumber() {
	long number = 987363526782987l;
	return number;
}
public boolean isPunctured() {
	boolean carPuncture = false;
	return carPuncture;
}
public String bikeName(){
	String name = "HONDA";
	return name;
}
public double runningKM(){
	double km = 5245252.62;
	return km;
}
}

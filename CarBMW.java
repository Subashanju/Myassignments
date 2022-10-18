package week3.day1;

public class CarBMW extends Cars{
	public static void main(String[] args) {
		CarBMW obj = new CarBMW();
		obj.openSUnRoof();
		obj.turnAC();
		obj.applyBreak();
	}
	public void autoPark() {
		System.out.println("Park");
	}
   public void applybreak() {
	   System.out.println("Normal break");
   }
}

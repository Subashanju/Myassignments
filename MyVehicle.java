package week3.day1;

public class MyVehicle {

	public void applyBreak() {
		System.out.println("Apply break");
	}
   public void soundHoron() {
	   System.out.println("Sound Horon");
   }
   public static void main(String[] args) {
	Cars obj1 = new Cars();
	obj1.applybreak();
	
	CarBMW obj2 = new CarBMW();
	obj2.applybreak();
	
}
	

}

package week3.day1;

public class Cars extends MyVehicle{
	public static void main(String[] args) {
		Cars objcar = new Cars();
		objcar.soundHoron();
		objcar.applyBreak();
	
		
	}
	public void openSUnRoof() {
		System.out.println("Sun roof");
	}
	public void turnAC() {
		System.out.println("AC On");
	}
	public void applybreak() {
		   System.out.println("ABS break");
	   }

}

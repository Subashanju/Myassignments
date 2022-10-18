package week3.day1;

public class Auto extends MyVehicle {
	public static void main(String[] args) {
		Auto objauto = new Auto();
		objauto.applyBreak();
	}
	public void handStartup() {
		System.out.println("Start auto");
	}

}

package week3.day1;

public class BajajAuto extends Auto{
	public static void main(String[] args) {
		BajajAuto baj= new BajajAuto();
		baj.handStartup();
		baj.applyBreak();
		baj.soundHoron();
	}
	public void automatic() {
		System.out.println("Autometic Start");
	}

}

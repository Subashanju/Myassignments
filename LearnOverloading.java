package week3.day1;

public class LearnOverloading {
	public int add(int a , int b) {
		return a+b;
	}
public int add(int a , int b, int c) {
	return a+b+c;
		
	}
public float add(float a , float b) {
	return a+b;
}
public float add(float  c , int d) {
	return c+d;
	
}
public static void main(String[] args) {
	LearnOverloading obj = new LearnOverloading();
	System.out.println(obj.add(5, 3));
	System.out.println(obj.add(5, 3 , 2));
	System.out.println(obj.add(52.32f, 52.0f));
	System.out.println(obj.add(52.32f, 45));
	
}

}

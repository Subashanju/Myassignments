package week1.day1;

public class Car {
	
		public void printCarName()
	    {
	    	System.out.println("BMW");
	    }
	    
	    public int getRegNumber()
	    
	    {
	    	int regNumber = 1992;
	        return regNumber; 		
		}
	    
	    public String getColor()
	    {
	    	String color = "Blue";
	    	return color;
	    }
	    
	    public boolean isCarPuncture()
	    
	    {
	    	boolean isPuncture = false;
	    	return isPuncture;
	    }
	    
	    public int addNumbers(int num1,int num2,int num3)
	    
	    {
	    	int sum = num1+num2+num3;
	    	return sum;
	    }
	    
	    private int subNumbers(int a, int b)
	    {
	    	int sub = a-b;
	    	return sub;
	    }
	    
	    float mulNumbers(float num1,float num2)
	    
	    {
	    	float mul = num1*num2;
	    	return mul;
	    }
	    public int divNumbers(int c, int d)
	    
	    {
	    	int  div=c/d;
	    	return div;
	    }

	    public static void main(String[] args) 
	    {		
	      
	    	Car car1 = new Car();
	    	int addNumbers = car1.addNumbers(3,4,5);
	    	System.out.println("AddNumbers :" +addNumbers);
	    	
	    	int subNumbers = car1.subNumbers(10, 5);
	    	System.out.println("SubNumbers :" +subNumbers);
	    	
	    	float mulNumbers = car1.mulNumbers(5, 2);
	    	System.out.println("MulNumbers :" +mulNumbers);
	    }    
	    
	}


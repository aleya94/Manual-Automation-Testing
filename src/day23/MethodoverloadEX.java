package day23;

public class MethodoverloadEX {
	
	//method to add three integer
	public int add(int x, int y, int z) {
		return x+y+z;
		
	}
	
	//Overloaded method to add four integer 
	public int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
		
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodoverloadEX obj= new MethodoverloadEX();
		
		//calling add method with three arguments
		
		System.out.println("Sum of xyz: " +obj.add(5, 10, 10));
		
		//Calling overloaded add method with four arguments
		
		System.out.println("Sum of abcd: " + obj.add(21, 112, 9,12));
		

	}

}

package day23;

public class MethodOverloadEX2 {
	
	//under one class, three method with same name, method return type same
	//only method parameter is different
	public String together(String a, String b) {
		return a+b;
	}
	
	public String together(String x, String y, String z) {
		return x+y+z;
	}
	
	public String together(String a) {
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		MethodOverloadEX2 adder=new MethodOverloadEX2();
		
		System.out.println("Adding/Concatenating String 1 param: " +adder.together("Hello World!"));
		
		System.out.println("Adding/Concatenating String 3 param: " +adder.together("\nHello World!", " \nJava Overload" ,  "\nJava OOPS Polymorphism"));
		
		System.out.println("Adding/Concatenating String 2 param: " +adder.together("\nHello Java!", "\nHello World"));
		
	}

}

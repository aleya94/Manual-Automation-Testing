package day16;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=5, c=20, d=30; 
		
		System.out.println(a+b); //15
		System.out.println(a-b); //5
		System.out.println(a*b); //50
		System.out.println(a/b); //2
		System.out.println(9%4); //Modulus operator //0
		
		//Increment & Decrement operators
		
		System.out.println(++a); //Pre -Increment //11
		System.out.println(a++); //Post- Increment //11
		System.out.println(a); //12
		
		System.out.println(--b); //4
		System.out.println(b--); //4
		System.out.println(b); //3
		
		
		System.out.println(c+d); //50
		System.out.println(c-d); //-10
		System.out.println(c*d); //600
		
		System.out.println(++c); //21
		System.out.println(c++); //21
		System.out.println(--d); //29
		System.out.println(d--); //29
		
		

	}

}

package day20;

//Java method with a return value
//calling method by invoking object

public class MethodWithReturnValueByObject {
	
	//User defined Method
	public int multiply (int a, int b, int c) {
		int result = a*b*c;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Object
		MethodWithReturnValueByObject  abc = new MethodWithReturnValueByObject ();
		
		//Call method
		int x = abc.multiply(10, 25, 35);
		System.out.println(x);
		
		System.out.println(abc.multiply(10, 25, 35));

	}

}
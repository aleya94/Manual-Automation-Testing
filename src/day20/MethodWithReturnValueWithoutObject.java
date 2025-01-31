package day20;

public class MethodWithReturnValueWithoutObject {
	
	//User defined Method
		public static int multiply (int a, int b, int c) {
			int result = a*b*c;
			return result;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Call method
			int x = multiply(10, 25, 35);
			System.out.println(x);
			
			System.out.println(multiply(10, 25, 35));
		}
	}


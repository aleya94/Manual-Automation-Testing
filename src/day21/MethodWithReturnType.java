package day21;

public class MethodWithReturnType {
	
	public int sum() {
		int a=2, b=5, c;
		
		c=a+b;
		//System.out.println(c);
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithReturnType obj = new MethodWithReturnType();
		int value = obj.sum();
		System.out.println(value);

	}

}

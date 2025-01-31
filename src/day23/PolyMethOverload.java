package day23;

public class PolyMethOverload {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b, double c) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyMethOverload obj = new PolyMethOverload();
		obj.add(10,20);
		obj.add(50, 60, 70);
		obj.add(25.5, 17.9);
		obj.add(2.2, 3.3, 4.4);
	}

}

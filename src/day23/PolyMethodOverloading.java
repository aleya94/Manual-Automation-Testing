package day23;

public class PolyMethodOverloading {
	
	public void sum(int a) {
		
	}
	public void sum() {
		
	}
	public void sum(int a, int b, int c) {
	
	}
	public void sum(int a, int b) {
	
	}
	public void sum(double a) {
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyMethodOverloading obj=new PolyMethodOverloading();
		obj.sum();
		obj.sum(1,2,3);
		obj.sum(3,5);
		obj.sum(1);
		obj.sum();
		

	}

}

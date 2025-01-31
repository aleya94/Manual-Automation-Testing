package day23;

public class MethodOverridingChild extends MethodOverridingBase   {
	public void className() //Method signature //return type void
	
	{	
		System.out.println("Child Class"); // Method Body
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		MethodOverridingChild obj=new MethodOverridingChild ();
		obj.className();
	}

}

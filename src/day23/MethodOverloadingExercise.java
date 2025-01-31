package day23;

public class MethodOverloadingExercise {
	
	public void Subtraction (int a, int b) {
		System.out.println("Aleya");
	}
	
	public void Subtraction (int c) {
		System.out.println("Ishra");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MethodOverloadingExercise obj=new MethodOverloadingExercise();
		obj.Subtraction(1,2);
		obj.Subtraction(3);
		
		
		
	
	}

}

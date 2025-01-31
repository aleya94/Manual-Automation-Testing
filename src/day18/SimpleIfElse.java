package day18;

public class SimpleIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String citizenship = "Canada";
		int age = 20;
		
		
		int passingScore = 70;
		
		
		
		if (citizenship.equalsIgnoreCase("USA") && age >=21) {
			System.out.println ("Person is Eligible to vote.");
			} else{
			System.out.println ("Person is not Eligible to vote.");	
			}
		
		
		
		if (citizenship.equalsIgnoreCase("USA") || age >=21) {
			System.out.println ("Person is Eligible to vote.");
			} else{
			System.out.println ("Person is not Eligible to vote.");	
			}
		
		
		
		if (!(citizenship.equalsIgnoreCase("USA")) && (age >=21)) {
			System.out.println ("Person is Eligible to vote.");
			} else{
			System.out.println ("Person is not Eligible to vote.");	
			}
		

		
		if(passingScore >=60){
			System.out.println ("Student has passed the exam!");
		} else {
			System.out.println ("Student has not passed the exam!");
			
		}
	}
}

package day20;

public class BasicMethod {
	
	public void checkEligibility() {
		int age = 20;
		String citizen = "USA";
		
		if (age >= 18 && citizen.equalsIgnoreCase("USA"))
		{
			System.out.println("Eligibile to vote");
		} 
		else
		{
			System.out.println("Not Eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object Creation
		BasicMethod obj = new BasicMethod();
		obj.checkEligibility();
	}

}

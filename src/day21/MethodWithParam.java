package day21;

public class MethodWithParam {
	
	public void checkEligibilityWithParam(String citizen, int age)
	{
		if (citizen.equalsIgnoreCase("USA") && age >=18)
		{
			System.out.println("Eligible to vote");
		}
		else 
		{
			System.out.println("Not Eligible to vote");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithParam obj = new MethodWithParam();
		obj.checkEligibilityWithParam("Canada", 20);

	}

}

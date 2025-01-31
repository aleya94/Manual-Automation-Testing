package day21;

public class MethodWithReturnTypeToVote {

	public String checkEligibilityWithreturn(String citizen, int age)
	{
		if (citizen.equalsIgnoreCase("USA") && age >=18)
		{
			return "Eligible to vote";
		}
		else 
		{
			return "Not Eligible to vote";
		}
		
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithReturnTypeToVote obj = new MethodWithReturnTypeToVote();
		String result=obj.checkEligibilityWithreturn("USA", 40);
		System.out.println(result);
		
		System.out.println();
	}

}

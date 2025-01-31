package day19;

public class IsElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 18;
		String citizen = "US";
		
		if (age >= 18) {
			System.out.println ("You are partially eligible");
			
			if(citizen.equalsIgnoreCase("USA")) {
				System.out.println ("Fully eligible");
			} else {
				System.out.println ("Not a Citizen");
			}
		} else {
			System.out.println ("Not eligible");
		}

	}

}

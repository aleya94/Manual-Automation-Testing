



package day20;

public class DoWhile {

	
	public static void main(String args[])
	{
		int number=200;
		
		do
		 {
			//check if the number is even 
			if (number % 2 == 0) {
				System.out.println("Aleya");
			}
			number++;
		}while (number <= 100);
		
		System.out.println("itsoutsideloop");
		
		
	}
}

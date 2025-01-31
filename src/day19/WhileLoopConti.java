package day19;

public class WhileLoopConti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check if the number are even between 1 to 100
		//if even then print your name using while loop
		
		int number = 1;
		//while loop to check numbers between 1 to 100
		while (number <= 100) {
			//check if the number is even 
			if (number % 2 == 0) {
				System.out.println("Aleya");
			}
			number++;
		}
		
	}

}



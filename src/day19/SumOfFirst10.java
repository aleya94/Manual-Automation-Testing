package day19;

public class SumOfFirst10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1; //Start from the first natural number
		int sum = 0; //Variable to store the sum
		
		while (number <= 10) {
			sum += number; //Add the current number to the sum
			number++; //Increment the number
		}
		//print the total sum
		System.out.println("The sum of first 10 natural numbers is: " +sum);				
	}

}

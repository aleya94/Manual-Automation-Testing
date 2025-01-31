package day19;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of odd number from 1 to 50
		
		int number = 1;
		int sum = 0;
		
		while (number <= 50) {
			if(number %2 != 0) {
				sum += number;
			}
			number ++;
		}
	System.out.println("The sum of all odd number from 1 to 50 is: " + sum);

	}
}

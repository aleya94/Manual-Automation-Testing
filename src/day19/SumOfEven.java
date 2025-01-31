package day19;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2;
		int sum = 0;
		
		while(number <= 100) {
			if (number % 2 == 0) {
				sum += number;
			}
			number ++;
		}
		System.out.println ("The sum of all even numbers between 1 to 100 is: " +sum);

	}

}

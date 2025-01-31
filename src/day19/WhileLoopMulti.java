package day19;

public class WhileLoopMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiples of 5 between 1 and 100 using while loop
		
		int number = 1;
				while (number <=100) {
					if (number % 5 == 0) {
						System.out.println(number);
					}
					number++;
				}
	}

}

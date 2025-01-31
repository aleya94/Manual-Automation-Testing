package day19;

public class IfElseLadderConti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to check the score of the student
		
			//A = 85-95;
			//B = 75-84;
			//C = 65-74;
			//D = 45-64;
		int score = 93;
		
		if (score >= 85 && score <= 95) {
			System.out.println("Grade A");
		} else {
			if(score >= 75 && score <= 84) {
			System.out.println("Grade B");
			} else {
				if (score >= 65 && score <= 74) {
					System.out.println("Grade C");
				} else {
					if (score >= 45 && score <= 64) {
						System.out.println("Grade D");
					} else {
						System.out.println("Grade Invalid");
					}
				}
			}
		}
	}
}

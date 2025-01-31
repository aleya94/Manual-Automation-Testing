package day20;

public class MethodWithoutReturnValueWithoutObj {
	//write method without returning any value
		//Calling method WITHOUT invoking Object
		//need static on creating method
		//Create method without returning any value (without object)
		
		//Create Method
			public static void studentRank(int marks) {
				if (marks >= 600) {
					System.out.println("Rank A");
				} else if (marks >= 500) {
					System.out.println("Rank B");
				}
				else {
					System.out.println("Rank C");
				}
			}
				
			//main Method
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//call method without object 
			
			studentRank(450);

		}
}

package day20;

public class MethodWithoutReturnValueByObj {
	//write method without returning any value
	//Calling method by invoking Object
	
		//Create Method
		public void studentRank(int marks) {
			if (marks >= 600) {
				System.out.println("Rank A");
			} else if (marks >= 500) {
				System.out.println("Rank B");
			}
			else {
				System.out.println("Rank C");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//create Object
			//NO need static on creating method
			
			MethodWithoutReturnValueByObj object = new MethodWithoutReturnValueByObj();
			
			//call method
			object.studentRank (650);
			
			
			//Call method by invoking Object
			//JavaMethodsStudentRank object = new JavaMethodsStudentRank();
			//object.studentRank (600);
		}
	}


package day18;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b= 20;
		int c = 10;
		
		//Logical AND &&, Logical OR ||, Logical NOT !
		
		System.out.println ((a > b) && (c==a)); //F && T //F
		System.out.println ((b > a) && (c < b)); //T && T //T
		
		
		System.out.println ((a > b) || (c==a)); // F || T //T
		System.out.println ((b > a) || (c < b)); //T || T //T
		
		System.out.println (!((a > b) || (c==a))); //!(F||T) //!(T)//F
		System.out.println ((b > b) && (c==a));
	
	}

}


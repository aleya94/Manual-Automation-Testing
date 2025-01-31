package day20;

public class PrintMyName {
	public void printName(String name) {
		System.out.println("Print My Name: " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMyName printName = new PrintMyName();
		
		for (int i = 0; i < 20; i++) {

			printName.printName("Aleya");
		}

	}

}

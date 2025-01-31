package day23;

public class MethOverrideBankSBI extends MethodOverrideBank{
	
	public float getRateOfInterest() {
		return 5.0f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverrideBank SBI =new  MethOverrideBankSBI();
		
		System.out.println("SBI Rate of Interest: " +SBI.getRateOfInterest()+ "%");
		
	}

}

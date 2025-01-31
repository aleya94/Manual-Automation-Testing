package day23;

public class MethoverrideBankICICI extends MethodOverrideBank{
	
	public float getRateOfInterest() {
		return 6.0f;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverrideBank ICICI =new MethoverrideBankICICI();
		
		System.out.println("ICICI Rate of Interest: " +ICICI.getRateOfInterest()+ "%");
		

	}

}

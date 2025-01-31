package day23;

public class MethoverrideBankAXIS extends MethodOverrideBank{
	
	public float getRateOfInterest() {
		return 7.5f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverrideBank AXIS =new MethoverrideBankAXIS();
		System.out.println("AXIS Rate of Interest: " +AXIS.getRateOfInterest()+ "%");

	}

}

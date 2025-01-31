package day24;

public class AbstractionSubClassHeroHonda extends AbstractionBike {
	
	@Override
	public void engine() {
		System.out.println("Bikes have Engine.");
	}
	
	@Override
	public void wheels() {
		System.out.println("Bikes have Wheels.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Object
		AbstractionSubClassHeroHonda objHH = new AbstractionSubClassHeroHonda();
		objHH.engine();
		objHH.seat();
		objHH.wheels();
		objHH.handle();

	}

}

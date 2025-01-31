package day24;

public abstract class AbstractionBike {
	//abstract class 
	
	public void handle() {
		System.out.println("Bikes have Handle.");
	}
	
	public void seat() {
		System.out.println("Bikes have Seats.");
	}
	
	
	public abstract void engine();
	public abstract void wheels();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionSubClassHeroHonda obj =new AbstractionSubClassHeroHonda();
		obj.engine();
		obj.wheels();

	}

}

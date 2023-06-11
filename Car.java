public class Car extends MotorVehicle{
	
	boolean seatbelt;

	public Car(){
		seatbelt = false;
	}

	public void setSeatBelt(boolean seatbelt){
		this.seatbelt = seatbelt;
	}

	public boolean getSeatbelt(){
		return seatbelt;
	}

	public void sizeEng(double sizeofEngine){
		System.out.println("Mesin aing "+ sizeofEngine);
	}
}
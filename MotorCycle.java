public class MotorCycle extends MotorVehicle{
	int numGear;

	public MotorCycle(){
		numGear = 0;
	}

	public void setGearFoot(int numGear){
		this.numGear = numGear;
	}

	public Integer getGearFoot(){
		return numGear;
	}

	public void licencePlate(String licencePlate){
		this.licencePlate = licencePlate;
		System.out.println("Plat nomornya gweh "+ licencePlate);
	}

	
}
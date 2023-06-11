public class MotorVehicle extends Vehicle{
	int sizeofEngine;
	String licencePlate;

	MotorVehicle(){
		sizeofEngine = 1;
		licencePlate = "H 1 IDN";
	}
	MotorVehicle(int sizeEng, String lcPlate){
		sizeofEngine = sizeEng;
		licencePlate = lcPlate;
	}

	public void licencePlate(String licencePlate){
		this.licencePlate = licencePlate;
		System.out.println("Plat nomornya "+ licencePlate);
	}

	public void sizeEng(int sizeofEngine){
		this.sizeofEngine = sizeofEngine;
		System.out.println("Mesin aing "+ sizeofEngine);
	}

	public int getSizeofEngine(){
		return sizeofEngine;
	}

	public String getLicencePlate(){
		return licencePlate;
	}

	public void setColor(String col){
		super.color = col;
	}

}
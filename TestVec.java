public class TestVec{
	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
		System.out.println("Sepeda Nih Boss");
		b1.color = "Ireng";
		b1.speed = 10;
		System.out.println("Color : "+b1.color);
		System.out.println("Speed : "+b1.speed);
		b1.ringBell();

		System.out.println("");
		MotorVehicle m1 = new MotorVehicle(200, "BP 1002 SPD");
		System.out.println("Motor Nih Boss");
		m1.setColor("Blue");
		m1.speed = 100;
		System.out.println("Color : "+m1.color);
		m1.licencePlate("B 1000 HG");
		m1.sizeEng(10);
		System.out.println("Size Of Engine : "+m1.getSizeofEngine());
		System.out.println("Licence Plate : "+m1.getLicencePlate());

		System.out.println("");
		MotorCycle motor = new MotorCycle();
		System.out.println("Motor Baru Nih Boss");
		motor.setColor("Brown");
		motor.speed = 100;
		motor.setGearFoot(10);
		System.out.println("Color : "+motor.color);
		System.out.println("Gear : "+motor.getGearFoot());
		motor.licencePlate("B 1023 HG");
		System.out.println("Size Of Engine : "+motor.getSizeofEngine());
		System.out.println("Licence Plate : "+motor.getLicencePlate());
		KendaraanMelaju(motor);

		System.out.println("");
		Car c =  new Car();
		c.sizeEng(10.54);
		c.licencePlate("B 1345 HG");

		System.out.println("");
		ShowRoom showroom = new ShowRoom();
		showroom.koleksi(m1);
		showroom.koleksi(motor);
		showroom.koleksi(c);
	}

	public static void KendaraanMelaju(Vehicle vec){
		vec.goStraight();
	}
}
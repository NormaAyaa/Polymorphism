public class Vehicle{
	protected double speed;
	protected String color;

	Vehicle(){
		speed = 0;
		color = "Orange";
	}

	public void goStraight(){
		System.out.println("Maju...");
	}

	public void turnLeft(){
		System.out.println("Belok Kiri");
	}

	public void turnRight(){
		System.out.println("Belok Kiri");
	}
}
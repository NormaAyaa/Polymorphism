import java.util.ArrayList;
public class ShowRoom{
	ShowRoom(){

	}

	public void koleksi(MotorVehicle bumbum){
		if (bumbum.getLicencePlate() != "H 1 IDN") {
			System.out.println(bumbum.getLicencePlate()+ " Ada nih");
		}else{
			System.out.println("bukan punya saya");
		}
	}
}
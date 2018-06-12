package ex3;

public class ZoneCarnivore extends Zone {
	
	public ZoneCarnivore(String nomZone) {
		super(nomZone);
	}

	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 10;
	}


}

package ex3;

public class FermeReptile extends Zone {


	public FermeReptile(String nomZone) {
		super(nomZone, TypeAnimal.REPTILE, null);
	}

	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 0.1;
	}
}

package ex3;

public class Aquarium extends Zone {

	public Aquarium(String nomZone) {
		super(nomZone, TypeAnimal.POISSON, null);

	}

	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 0.2;
	}
}

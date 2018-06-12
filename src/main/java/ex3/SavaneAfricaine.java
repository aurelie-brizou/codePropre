package ex3;

public class SavaneAfricaine extends Zone {

	public SavaneAfricaine(String nomZone) {
		super(nomZone);
	}

	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 10;
	}
}

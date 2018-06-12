package ex3;

public class ZoneCarnivore extends Zone {

	public ZoneCarnivore(String nomZone){
		super(nomZone, TypeAnimal.MAMMIFERE, CategorieComportement.CARNIVORE);
	}

	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 10;
	}


}

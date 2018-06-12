package ex3;

/**
 * Représente une zone du zoo : Savane africaine
 * @author Aurélie-B
 */
public class SavaneAfricaine extends Zone {

	public SavaneAfricaine(String nomZone) {
		super(nomZone, TypeAnimal.MAMMIFERE, CategorieComportement.HERBIVORE);
	}

	/**
	 * Construteur de Savane Africaine
	 * @param nomZone
	 */


	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 10;
	}
}

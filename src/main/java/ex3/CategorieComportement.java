package ex3;

/**
 * Enumération du comportement d'un animal
 * @author Aurélie-B
 */
public enum CategorieComportement {

	CARNIVORE ("CARNIVORE"), HERBIVORE ("HERBIVORE");
	
	public String comportement;
	CategorieComportement (String comportement) {
		this.comportement = comportement;
	}
}

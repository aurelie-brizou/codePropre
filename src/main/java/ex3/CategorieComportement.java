package ex3;

public enum CategorieComportement {

	CARNIVORE ("CARNIVORE"), HERBIVORE ("HERBIVORE");
	
	public String comportement;
	CategorieComportement (String comportement) {
		this.comportement = comportement;
	}

	public String getComportement() {
		return this.comportement;
	}
}

package ex3;

public class Animal {

	private String nomAnimal;
	private TypeAnimal typeAnimal;
	private CategorieComportement comportement;


	/**
	 * Constructeur d'un animal
	 * @param nomAnimal
	 * @param typeAnimal
	 * @param comportement
	 */
	public Animal (String nomAnimal, TypeAnimal typeAnimal, CategorieComportement comportement) {
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
		this.comportement = comportement;
	}


	public String getNomAnimal() {
		return nomAnimal;
	}


	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}


	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}


	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}


	public CategorieComportement getComportement() {
		return comportement;
	}


	public void setComportement(CategorieComportement comportement) {
		this.comportement = comportement;
	}

}

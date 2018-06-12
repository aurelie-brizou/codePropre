package ex3;

import java.util.List;

public class Zoo {

	private String nom;
	
	List<Zone> zones;
	
	
	public Zoo(String nom){
		this.nom = nom;
	}
	

	/**
	 * Méthode pour ajouter un animal
	 * @param animal
	 */
	
	public void addAnimal(Animal animal){
		if (animal.getTypeAnimal().equals(TypeAnimal.MAMMIFERE) && (animal.getComportement().equals(CategorieComportement.CARNIVORE))) {
			zoneCarnivore.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals(TypeAnimal.MAMMIFERE) && (animal.getComportement().equals(CategorieComportement.HERBIVORE))){
			savaneAfricaine.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals(TypeAnimal.REPTILE)){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals(TypeAnimal.POISSON)){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public ZoneCarnivore getZoneCarnivore() {
		return zoneCarnivore;
	}

	public void setZoneCarnivore(ZoneCarnivore zoneCarnivore) {
		this.zoneCarnivore = zoneCarnivore;
	}

	public FermeReptile getFermeReptile() {
		return fermeReptile;
	}

	public void setFermeReptile(FermeReptile fermeReptile) {
		this.fermeReptile = fermeReptile;
	}

	public Aquarium getAquarium() {
		return aquarium;
	}

	public void setAquarium(Aquarium aquarium) {
		this.aquarium = aquarium;
	}

	public SavaneAfricaine getSavaneAfricaine() {
		return savaneAfricaine;
	}

}

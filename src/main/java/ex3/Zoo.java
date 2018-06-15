package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un zoo
 * @author Aurélie-B
 */
public class Zoo {

	private String nomZoo;
	private List<Zone> zones;

	/**
	 * constructeur de Zoo, crée une liste de zones et instancie les différentes zones
	 * @param nomZoo
	 */
	public Zoo(String nomZoo){
		this.nomZoo = nomZoo;
		this.zones = new ArrayList<Zone>();
		this.zones.add(new ZoneCarnivore("Zone carnivore"));
		this.zones.add(new SavaneAfricaine("Savane Africaine"));
		this.zones.add(new FermeReptile("Ferme Reptile"));
		this.zones.add(new Aquarium("Aquarium"));
	}

	/**
	 * Méthode pour afficher tous les animaux par zone
	 */
	public void afficherListeAnimaux(){
		for (Zone typeZone : zones) {
			typeZone.afficherListeAnimaux();
			
			
			/* ctrl shift o import automatique
			 * zones.forEach (typeZone -> typeZone.afficherListeAnimaux());
			 * */
		}
	}



	/**
	 * Méthode pour ajouter un animal
	 * @param animal
	 */
	
	//to do coder pour retirer la construction if else if 
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
}

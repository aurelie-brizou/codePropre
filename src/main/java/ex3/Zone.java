package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une zone du zoo
 * @author Aurelie-B
 */

public abstract class Zone {

	protected String nomZone;
	protected List<Animal> animaux;
	protected TypeAnimal typeAnimal;
	protected CategorieComportement comportement;

	/**
	 * constructeur de Zone et crée une liste d'animaux
	 * @param nomZone
	 */
	public Zone (String nomZone, TypeAnimal typeAnimal, CategorieComportement comportement) {
		this.nomZone = nomZone;
		this.typeAnimal = typeAnimal;
		this.comportement = comportement;
		this.animaux = new ArrayList();
	}
		
	/**
	 * Ajouter un nouvel animal
	 * @param Animal animal
	 */
	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}

	/**
	 * boucle pour parcourir chaque animal du tableau animaux et les affiche
	 */
	public void afficherListeAnimaux(){
		for (Animal an : animaux){
			System.out.println(an.getNomAnimal());
		}
	}
	

	/**
	 * booléen pour tester si l'animal va dans tel ou tel zone
	 * @return accepte
	 */
	public boolean AccepteAnimauxZone(){
		boolean accepte = false;
		return accepte;
	}
	

	/**
	 * Méthode qui compte les animaux
	 * @return nombre d'animaux
	 */
	public int compterAnimaux(){
		return animaux.size();
	}

	public abstract double calculerKgsNourritureParJour();



}

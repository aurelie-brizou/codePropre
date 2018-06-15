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
	 * booléen pour tester si l'animal va dans telle ou telle zone
	 * @return accepte
	 */
	public boolean AccepteAnimauxZone(Animal animal){
		boolean accepte = false;
		if (animal.getTypeAnimal().equals(this.getTypeAnimal()) && (animal.getComportement().equals(this.getComportement()))) {
			accepte = true;
		} else if () {
			
		}
		
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

	/**
	 * @return the nomZone
	 */
	public String getNomZone() {
		return nomZone;
	}

	/**
	 * @param nomZone the nomZone to set
	 */
	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}

	/**
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}

	/**
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

	/**
	 * @return the typeAnimal
	 */
	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}

	/**
	 * @param typeAnimal the typeAnimal to set
	 */
	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	/**
	 * @return the comportement
	 */
	public CategorieComportement getComportement() {
		return comportement;
	}

	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(CategorieComportement comportement) {
		this.comportement = comportement;
	}



}

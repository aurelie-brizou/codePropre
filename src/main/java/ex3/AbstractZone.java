package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente les zones
 * @author Aurelie-B
 */

public abstract class AbstractZone {

	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;

	/**
	 * constructeur de AbstractZone
	 * @param savaneAfricaine
	 * @param zoneCarnivore
	 * @param fermeReptile
	 * @param aquarium
	 */
	public AbstractZone (SavaneAfricaine savaneAfricaine, ZoneCarnivore zoneCarnivore, FermeReptile fermeReptile, Aquarium aquarium) {
		this.savaneAfricaine = savaneAfricaine;
		this.zoneCarnivore = zoneCarnivore;
		this.fermeReptile = fermeReptile;
		this.aquarium = aquarium;
	}

	private List<Animal> animaux;

	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}

	public AbstractZone() {
		animaux = new ArrayList();
	}

	// boucle pour parcourir chaque animal du tableau animaux et les affiche
	public void afficherListeAnimaux(){
		for (Animal an : animaux){
			System.out.println(an.getNomAnimal());
		}
	}

	public int compterAnimaux(){
		return animaux.size();
	}

	public abstract double calculerKgsNourritureParJour();



	/**
	 * Getter de SavaneAfricaine
	 * @return savaneAfricaine
	 */
	public SavaneAfricaine getSavaneAfricaine() {
		return savaneAfricaine;
	}

	/**
	 * Setter de SavaneAfricaine
	 * @return savaneAfricaine
	 */
	public void setSavaneAfricaine(SavaneAfricaine savaneAfricaine) {
		this.savaneAfricaine = savaneAfricaine;
	}

	/**
	 * Getter de ZoneCarnivore
	 * @return zoneCarnivore
	 */
	public ZoneCarnivore getZoneCarnivore() {
		return zoneCarnivore;
	}

	/**
	 * Setter de ZoneCarnivore
	 * @return zoneCarnivore
	 */
	public void setZoneCarnivore(ZoneCarnivore zoneCarnivore) {
		this.zoneCarnivore = zoneCarnivore;
	}

	/**
	 * Getter de FermeReptile
	 * @return FermeReptile
	 */
	public FermeReptile getFermeReptile() {
		return fermeReptile;
	}

	/**
	 * Setter de FermeReptile
	 * @return FermeReptile
	 */
	public void setFermeReptile(FermeReptile fermeReptile) {
		this.fermeReptile = fermeReptile;
	}

	/**
	 * Getter de Aquarium
	 * @return Aquarium
	 */
	public Aquarium getAquarium() {
		return aquarium;
	}

	/**
	 * Setter de Aquarium
	 * @return Aquarium
	 */
	public void setAquarium(Aquarium aquarium) {
		this.aquarium = aquarium;
	}
}

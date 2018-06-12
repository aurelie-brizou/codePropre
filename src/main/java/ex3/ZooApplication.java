package ex3;

public class ZooApplication {

	public static void main(String[] args) {

		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Gazelle", TypeAnimal.MAMMIFERE, CategorieComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", TypeAnimal.MAMMIFERE, CategorieComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", TypeAnimal.MAMMIFERE, CategorieComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", TypeAnimal.MAMMIFERE, CategorieComportement.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", TypeAnimal.POISSON, CategorieComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", TypeAnimal.POISSON, CategorieComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", TypeAnimal.REPTILE, CategorieComportement.CARNIVORE));
		zoo.addAnimal(new Animal("Python", TypeAnimal.REPTILE, CategorieComportement.CARNIVORE));


	}
}

package ex3;

public enum TypeAnimal {

	MAMMIFERE ("MAMMIFERE"), POISSON ("POISSON"), REPTILE ("REPTILE");
	
	public String type;
	TypeAnimal (String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}
}

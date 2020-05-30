package CreationalPattern4build;

public abstract class Softdrink implements ItemType {
	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();
}

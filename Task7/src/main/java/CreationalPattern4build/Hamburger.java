package CreationalPattern4build;

public abstract class Hamburger implements ItemType {
	public Packing packing() {
	      return new Wrapper();
	   }

	   public abstract float price();
}

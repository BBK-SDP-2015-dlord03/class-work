package inheritance.stuff;

public class D implements B, C {
	
	// D has to choose which eats in the diamond to use.
	public String eats() {
		return "ahhhhh";
	}


}

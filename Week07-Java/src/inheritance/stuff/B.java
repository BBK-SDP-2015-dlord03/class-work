package inheritance.stuff;

public interface B extends A {
	
	public default String eats() {
		return "Sometime I eat";
	}

}

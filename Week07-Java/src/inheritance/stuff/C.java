package inheritance.stuff;

public interface C extends A {
	
	public default String eats() {
		return "I eat regularly";
	}

}

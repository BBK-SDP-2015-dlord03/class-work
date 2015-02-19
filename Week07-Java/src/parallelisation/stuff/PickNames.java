package parallelisation.stuff;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PickNames {
	
	public static void main(String[] args) {
		
		List<String> friends = Arrays.asList("Betty", "Bob", "James");
	
		// Filter
		friends.stream()
			.filter(name -> name.startsWith("B"))
			.forEach(System.out::println);
		
		// With predicate object
		Predicate<String> startsWithB = name -> name.startsWith("B");
		friends.stream()
			.filter(startsWithB)
			.forEach(System.out::println);
		
	}

}

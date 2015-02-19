package parallelisation.stuff;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickFirst {

	public static void main(String[] args) {

		List<String> friends = Arrays.asList("Betty", "Bob", "Barnaby", "Frank", "Liam", "Fiona");
		
		Optional<String> foundName = 
				friends
				.stream()
				.filter(name -> name.startsWith("F"))
				.findFirst();
		
		foundName.ifPresent(System.out::println);
		
	}
}
